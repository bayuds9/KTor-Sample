package com.flowerencee.models.data.request

data class AddProductImageRequest(
    var accountId: String = "",
    var merchantId: String = "",
    var productId: String = "",
    var image64: ArrayList<String> = ArrayList()
)
