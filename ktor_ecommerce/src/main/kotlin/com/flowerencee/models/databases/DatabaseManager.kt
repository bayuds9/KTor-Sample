package com.flowerencee.models.databases

import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.*
import com.flowerencee.models.databases.entities.*
import com.flowerencee.models.support.Base65536
import com.flowerencee.models.support.PARAMETERS
import com.flowerencee.plugins.getTimeNow
import org.ktorm.database.Database
import org.ktorm.dsl.delete
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

    /*User Management*/

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
            PARAMETERS.PARAM_ID.TRANSACTIONS -> 0
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

    fun checkEmailNotAttempt(email: String): Boolean {
        return kTormDatabase.sequenceOf(AccountTable).toList().filter { it.email == email }.toList().isEmpty()
    }

    fun checkPhoneNumberNotAttempt(phone: String): Boolean {
        return kTormDatabase.sequenceOf(ProfileTable).toList().filter { it.phone == phone }.toList().isEmpty()
    }

    fun createPassword(newPassword: String, profileId: String) : Boolean {
        return try {
            val updateRow = kTormDatabase.update(AccountTable){
                set(AccountTable.password, newPassword)
                where { it.id eq profileId }
            }

            updateRow > 0
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun getAllUser(): List<AccountEntity> {
        return kTormDatabase.sequenceOf(AccountTable).toList()
    }

    private fun getProfile(): List<ProfileEntity> {
        return kTormDatabase.sequenceOf(ProfileTable).toList()
    }


    /*Product Management*/
    fun validateMerchantId(id: String) : Boolean {
        return kTormDatabase.sequenceOf(MerchantTable).toList().any { it.merchantId == id }
    }
    fun insertProductImages(image: String, productId: String): Boolean {
        return try {
            ProductImageTable.let { img ->
                kTormDatabase.insert(img) {
                    set(img.productId, productId)
                    set(img.fileName, image)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
    fun createProduct(request: CreateProductRequest): String {
        val productId = generateId(PARAMETERS.PARAM_ID.PRODUCT)
        return try {
            kTormDatabase.useTransaction { transaction ->
                try {
                    val insertProduct = insertProduct(request, productId)
                    if (insertProduct) transaction.commit()
                    else transaction.rollback()
                } catch (e: Exception) {
                    e.printStackTrace()
                } catch (t: Throwable) {
                    t.printStackTrace()
                }
            }
            productId
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

    private fun insertProduct(request: CreateProductRequest, productId: String) : Boolean {
        return try {
            ProductTable.let { product ->
                kTormDatabase.insert(product) {
                    set(product.productId, productId)
                    set(product.merchantId, request.merchantId)
                    set(product.productName, request.name)
                    set(product.productDesc, request.desc)
                    set(product.productPrice, request.price)
                    set(product.productCategory, request.category)
                    set(product.productStock, request.stock)
                    set(product.createdAt, getTimeNow("yyyy-MM-dd"))
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun getProduct() : List<ProductEntity> {
        return kTormDatabase.sequenceOf(ProductTable).toList()
    }

    fun getProductImages(id: String) : List<String> {
        val data = kTormDatabase.sequenceOf(ProductImageTable).toList()
        val imageList = ArrayList<String>()
        data.filter { it.productId == id }.forEach {
            imageList.add(it.fileName)
        }
        return imageList
    }

    fun validateMerchantAccount(profileId: String, merchantId: String) : Boolean {
        val profile = kTormDatabase.sequenceOf(AccountTable).toList().firstOrNull { it.id == profileId }
        val merchant = kTormDatabase.sequenceOf(MerchantTable).toList().firstOrNull { it.merchantId == merchantId }
        return when (profile?.id) {
            merchant?.accountId -> true
            else -> false
        }
    }
    fun validateProductData(productId: String, merchantId: String) : Boolean {
        val merchant = kTormDatabase.sequenceOf(MerchantTable).toList().firstOrNull { it.merchantId == merchantId }
        val product = kTormDatabase.sequenceOf(ProductTable).toList().firstOrNull { it.productId == productId }
        return when (merchant?.merchantId) {
            product?.merchantId -> true
            else -> false
        }
    }
    fun deleteProductImage(productName: String, productId : String) : Boolean {
        return try {
            val fileData = getProduct().firstOrNull { it.productId == productId }
            if (fileData != null) {
                kTormDatabase.delete(ProductImageTable) { imgTable ->
                    imgTable.fileName eq productName
                }
                true
            }
            else false
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun updateProductStock(request: ManageProductStockRequest) : Boolean {
        return try {
            val product = getProduct().firstOrNull() {it.productId == request.productId}
            if (product != null) {
                val currentStock = product.productStock
                val result = when(request.sign) {
                    "A" -> currentStock.plus(request.stock)
                    "R" -> currentStock.minus(request.stock)
                    else -> null
                }
                val updatedRows: Int = if ((request.sign == "R" && request.stock <= currentStock) || request.sign == "A") {
                    kTormDatabase.update(ProductTable) {
                        set(ProductTable.productStock, result)
                        where { it.productId eq request.productId }
                    }
                } else 0
                updatedRows > 0
            }
            else false
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    /*Global Management*/

    fun getConfig(): List<ConfigEntity> {
        return kTormDatabase.sequenceOf(ConfigTable).toList()
    }

    private fun generateId(param: PARAMETERS.PARAM_ID): String {
        var id: String
        do {
            val head = when(param){
                PARAMETERS.PARAM_ID.ACCOUNT -> "ACC"
                PARAMETERS.PARAM_ID.PRODUCT -> "PROD"
                PARAMETERS.PARAM_ID.MERCHANT -> "MERCH"
                PARAMETERS.PARAM_ID.TRANSACTIONS -> "TRX"
            }
            id = Base65536.encodeBase65536String("$head - ${getTimeNow()}".toByteArray())
        } while (id.checkId(param) != 0)
        return id
    }

    private fun String.checkId(param: PARAMETERS.PARAM_ID): Int {
        return when (param) {
            PARAMETERS.PARAM_ID.PRODUCT -> kTormDatabase.sequenceOf(ProductTable).toList()
                .filter { it.productId == this }.toList().size

            PARAMETERS.PARAM_ID.ACCOUNT -> kTormDatabase.sequenceOf(AccountTable).toList().filter { it.id == this }
                .toList().size

            PARAMETERS.PARAM_ID.MERCHANT -> kTormDatabase.sequenceOf(MerchantTable).toList()
                .filter { it.merchantId == this }.toList().size
            PARAMETERS.PARAM_ID.TRANSACTIONS -> 0
        }
    }

}