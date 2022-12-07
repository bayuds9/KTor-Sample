package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object ProductImageTable : Table<ProductImageEntity>("product_image") {
    val productId = varchar("product_id").bindTo { it.productId }
    val fileName = varchar("file_name").bindTo { it.fileName }
}

interface ProductImageEntity : Entity<ProductImageEntity> {
    companion object : Entity.Factory<ProductImageEntity>()

    val productId: String
    val fileName: String
}