package com.flowerencee.models.databases

import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.RegisterAccountRequest
import com.flowerencee.models.data.request.RegisterMerchantRequest
import com.flowerencee.models.data.request.UserListByDateRequest
import com.flowerencee.models.databases.entities.*
import com.flowerencee.models.support.Base65536
import com.flowerencee.models.support.PARAMETERS
import com.flowerencee.plugins.getTimeNow
import org.ktorm.database.Database
import org.ktorm.dsl.eq
import org.ktorm.dsl.insert
import org.ktorm.dsl.update
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList
import java.time.LocalDate

class DatabaseManager {
    private val hostname = "localhost"
    private val databaseName = "eumkm"
    private val username = "root"
    private val password = ""

    private val kTormDatabase: Database

    init {
        val jdbcUrl = "jdbc:mysql://$hostname:3306/$databaseName?user=$username&password=$password&useSSL=false"
        kTormDatabase = Database.connect(jdbcUrl)
    }

    fun register(request: RegisterAccountRequest): String {
        val profileId = generateId(PARAMETERS.PARAM_ID.ACCOUNT)
        return try {
            kTormDatabase.useTransaction { transaction ->
                try {
                    val account = registerAccount(request, profileId)
                    val profile = registerProfile(request, profileId)
                    val merchant = when (request.type == 1 && request.merchantData != null) {
                        true -> request.merchantData?.let {
                            registerMerchant(it, profileId)
                        }

                        else -> true
                    }
                    if (account && profile && merchant == true) transaction.commit()
                    else transaction.rollback()
                } catch (e: Exception) {
                    e.printStackTrace()
                } catch (t: Throwable) {
                    t.printStackTrace()
                }
            }
            profileId
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

    fun updateProfileImage(imageName: String, profileId: String): Boolean {
        return try {
            ProfileTable.let { profile ->
                kTormDatabase.update(profile) {
                    set(profile.imageUrl, imageName)
                    where { it.id eq profileId }
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun registerAccount(request: RegisterAccountRequest, profileId: String): Boolean {
        return try {
            AccountTable.let { account ->
                kTormDatabase.insert(account) {
                    set(account.id, profileId)
                    set(account.email, request.email)
                    set(account.password, request.password)
                    set(account.type, request.type)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun registerProfile(request: RegisterAccountRequest, accountId: String): Boolean {
        return try {
            ProfileTable.let { profile ->
                kTormDatabase.insert(profile) {
                    set(profile.id, accountId)
                    set(profile.name, request.name)
                    set(profile.phone, request.phone)
                    set(profile.address, request.address)
                    set(profile.imageUrl, request.imageName)
                    set(profile.dob, request.dob)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun registerMerchant(request: RegisterMerchantRequest, accountId: String): Boolean {
        val merchantId = generateId(PARAMETERS.PARAM_ID.MERCHANT)
        return try {
            MerchantTable.let { merch ->
                kTormDatabase.insert(merch) {
                    set(merch.merchantId, merchantId)
                    set(merch.accountId, accountId)
                    set(merch.merchantName, request.merchantName)
                    set(merch.merchantAddress, request.merchantAddress)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun getProfileId(id: String): String {
        return Base65536.decodeBase65536(id).toString()
    }

    private fun getTotalRecord(param: PARAMETERS.PARAM_ID): Int {
        return when (param) {
            PARAMETERS.PARAM_ID.PRODUCT -> kTormDatabase.sequenceOf(ProductTable).totalRecords
            PARAMETERS.PARAM_ID.ACCOUNT -> kTormDatabase.sequenceOf(AccountTable).totalRecords
            PARAMETERS.PARAM_ID.MERCHANT -> kTormDatabase.sequenceOf(MerchantTable).totalRecords
        }
    }

    fun loginUser(request: LoginRequest): AccountEntity? {
        return getAllUser().firstOrNull { it.email == request.email && it.password == request.password }
    }

    fun getUserById(accountId: String): UserAccount? {
        val profileData = getProfile().firstOrNull { it.id == accountId }
        val userData = getAllUser().firstOrNull { it.id == accountId }
        return if (profileData != null && userData != null) {
            UserAccount(
                profileData.name,
                userData.email,
                profileData.phone,
                profileData.address,
                profileData.imageUrl,
                profileData.dob
            )
        } else null
    }

    fun getUserListByDate(request: UserListByDateRequest): List<UserAccount> {
        val end = LocalDate.parse(request.end)
        val from = LocalDate.parse(request.start)
        val userList = getProfile().filter { profile ->
            val profileDate = LocalDate.parse(profile.dob)
            profileDate.isAfter(from) && profileDate.isBefore(end)
        }
        val accountList = ArrayList<UserAccount>()
        userList.forEach {
            accountList.add(
                UserAccount(
                    it.name,
                    getAllUser().firstOrNull { user -> user.id == it.id }?.email,
                    it.phone,
                    it.address,
                    it.imageUrl,
                    it.dob
                )
            )
        }
        return accountList
    }

    fun checkEmail(email: String): Boolean {
        return kTormDatabase.sequenceOf(AccountTable).toList().filter { it.email == email }.toList().isEmpty()
    }

    fun checkPhoneNumber(phone: String): Boolean {
        return kTormDatabase.sequenceOf(ProfileTable).toList().filter { it.phone == phone }.toList().isEmpty()
    }

    private fun getAllUser(): List<AccountEntity> {
        return kTormDatabase.sequenceOf(AccountTable).toList()
    }

    private fun getProfile(): List<ProfileEntity> {
        return kTormDatabase.sequenceOf(ProfileTable).toList()
    }

    fun getConfig(): List<ConfigEntity> {
        return kTormDatabase.sequenceOf(ConfigTable).toList()
    }

    private fun generateId(param: PARAMETERS.PARAM_ID): String {
        var profileId: String
        do {
            profileId = Base65536.encodeBase65536String("ACC - ${getTimeNow()}".toByteArray())
        } while (profileId.checkId(param) != 0)
        return profileId
    }

    private fun String.checkId(param: PARAMETERS.PARAM_ID): Int {
        return when (param) {
            PARAMETERS.PARAM_ID.PRODUCT -> kTormDatabase.sequenceOf(ProductTable).toList()
                .filter { it.productId == this }.toList().size

            PARAMETERS.PARAM_ID.ACCOUNT -> kTormDatabase.sequenceOf(AccountTable).toList().filter { it.id == this }
                .toList().size

            PARAMETERS.PARAM_ID.MERCHANT -> kTormDatabase.sequenceOf(MerchantTable).toList()
                .filter { it.merchantId == this }.toList().size
        }
    }

}