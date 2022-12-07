package com.flowerencee.models.databases

import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.databases.entities.AccountEntity
import com.flowerencee.models.databases.entities.AccountTable
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

    fun getAllUser(): List<AccountEntity> {
        return kTormDatabase.sequenceOf(AccountTable).toList()
    }

}