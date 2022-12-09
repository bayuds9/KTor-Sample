package com.flowerencee.models.databases

import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.UserListByDateRequest
import com.flowerencee.models.databases.entities.*
import org.ktorm.database.Database
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

    fun loginUser(request: LoginRequest) : AccountEntity? {
        return getAllUser().firstOrNull { it.email == request.email && it.password == request.password }
    }

    fun getUserById(accountId: String) : UserAccount? {
        val profileData = getProfile().firstOrNull { it.id == accountId }
        val userData = getAllUser().firstOrNull {it.id == accountId}
        return if (profileData != null && userData != null) {
            UserAccount(profileData.name, userData.email, profileData.phone, profileData.address, profileData.imageUrl, profileData.dob)
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

    fun getAllUser(): List<AccountEntity> {
        return kTormDatabase.sequenceOf(AccountTable).toList()
    }
    fun getProfile(): List<ProfileEntity> {
        return kTormDatabase.sequenceOf(ProfileTable).toList()
    }

    fun getConfig(): List<ConfigEntity> {
        return kTormDatabase.sequenceOf(ConfigTable).toList()
    }


}