package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object AccountTable : Table<AccountEntity>("user_account") {
    val id = varchar("id").bindTo { it.id }
    val email = varchar("email").bindTo { it.email }
    val password = varchar("password").bindTo { it.password }
    val type = int("type").bindTo { it.type }
}
interface AccountEntity: Entity<AccountEntity> {
    companion object : Entity.Factory<AccountEntity>()
    val id: String
    val email: String
    val password: String
    val type: Int
}