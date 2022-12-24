package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.double
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object ProductTable : Table<ProductEntity>("product") {
    val productId = varchar("product_id").bindTo { it.productId }
    val productName = varchar("product_name").bindTo { it.productName }
    val productDesc = varchar("product_desc").bindTo { it.productDesc }
    val productPrice = double("product_price").bindTo { it.productPrice }
    val productStock = int("product_stock").bindTo { it.productStock }
    val productCategory = varchar("product_category").bindTo { it.category }
    val merchantId = varchar("merchant_id").bindTo { it.merchantId }
    val createdAt = varchar("create_at").bindTo { it.createdAt }
}

interface ProductEntity : Entity<ProductEntity> {
    companion object : Entity.Factory<ProductEntity>()

    val productId: String
    val productName: String
    val productDesc: String
    val productPrice: Double
    val productStock: Int
    val category: String
    val merchantId: String
    val createdAt: String
}