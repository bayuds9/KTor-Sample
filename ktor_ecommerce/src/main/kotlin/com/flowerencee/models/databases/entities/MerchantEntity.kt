package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object MerchantTable : Table<MerchantEntity>("merchant") {
    val merchantId = varchar("merchant_id").bindTo { it.merchantId }
    val accountId = varchar("account_id").bindTo { it.accountId }
    val merchantName = varchar("merchant_name").bindTo { it.merchantName }
    val merchantAddress = varchar("merchant_address").bindTo { it.merchantAddress }
}
interface MerchantEntity : Entity<MerchantEntity> {
    companion object : Entity.Factory<MerchantEntity>()
    val merchantId : String
    val accountId : String
    val merchantName : String
    val merchantAddress : String
}