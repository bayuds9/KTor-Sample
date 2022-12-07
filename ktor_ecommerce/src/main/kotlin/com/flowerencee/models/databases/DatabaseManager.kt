package com.flowerencee.models.databases

import org.ktorm.database.Database

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
}