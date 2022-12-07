package com.flowerencee.models.databases

import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.response.StatusResponse
import com.flowerencee.models.databases.entities.*
import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList

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
            UserAccount(profileData.name, userData.email, profileData.phone, profileData.address, profileData.imageUrl)
        } else null
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