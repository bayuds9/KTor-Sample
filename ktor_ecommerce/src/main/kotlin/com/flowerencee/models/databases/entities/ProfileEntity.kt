package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object ProfileTable : Table<ProfileEntity>("user_profile") {
    val id = varchar("account_id").bindTo { it.id }
    val name = varchar("profile_name").bindTo { it.name }
    val phone = varchar("profile_phone").bindTo { it.phone }
    val address = varchar("profile_address").bindTo { it.address }
    val imageUrl = varchar("profile_image").bindTo { it.imageUrl }
    val dob = varchar("dob").bindTo { it.dob }
}
interface ProfileEntity : Entity<ProfileEntity> {
    companion object : Entity.Factory<ProfileEntity>()
    val id: String
    val name: String
    val phone: String
    val address: String
    val imageUrl: String
    val dob: String
}