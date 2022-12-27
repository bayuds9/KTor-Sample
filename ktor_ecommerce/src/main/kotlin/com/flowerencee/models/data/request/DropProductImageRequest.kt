package com.flowerencee.models.data.request

data class DropProductImageRequest(
    var accountId: String = "",
    var merchantId: String = "",
    var productId: String = "",
    var imageName: String = ""
)
