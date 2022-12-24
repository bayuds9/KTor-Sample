package com.flowerencee.models.data.body

data class Product(
    var productId: String? = null,
    var productName: String? = null,
    var productStock: Int = 0,
    var productPrice: Double = 0.0,
    var productDesc: String? = null,
    var productCategory: String? = null,
    var merchantId: String? = null,
    var createdAt: String? = null,
    var productImage: ArrayList<String>? = null
)
