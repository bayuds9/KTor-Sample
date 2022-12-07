package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object ConfigTable : Table<ConfigEntity>("configurations") {
    val errorCode = varchar("errorCode").bindTo { it.errorCode }
    val message = varchar("message").bindTo { it.message }
}
interface ConfigEntity : Entity<ConfigEntity> {
    companion object : Entity.Factory<ConfigEntity>()
    val errorCode: String
    val message: String
}