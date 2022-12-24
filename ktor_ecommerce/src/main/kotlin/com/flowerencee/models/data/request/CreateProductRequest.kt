package com.flowerencee.models.data.request

data class CreateProductRequest(
    var name: String = "",
    var desc: String = "",
    var price: Double = 0.0,
    var stock: Int = 0,
    var category: String = "",
    var merchantId: String = "",
    var dateCreated: String = "",
    var image: ArrayList<String> = ArrayList()
)
