package com.flowerencee.models.databases.entities

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object ProductReviewTable : Table<ProductReviewEntity>("product_review") {
    val reviewId = varchar("id_review").bindTo { it.reviewId }
    val bookId = varchar("book_id").bindTo { it.bookId }
    val accountId = varchar("reviewer_id").bindTo { it.accountId }
    val anonymous = varchar("anonimous").bindTo { it.anonymous }
    val reviewBody = varchar("review_body").bindTo { it.reviewBody }
    val reviewTime = varchar("review_time").bindTo { it.reviewTime }
}

interface ProductReviewEntity : Entity<ProductReviewEntity> {
    companion object : Entity.Factory<ProductReviewEntity>()

    val reviewId: String
    val bookId: String
    val accountId: String
    val anonymous: String
    val reviewBody: String
    val reviewTime: String
}