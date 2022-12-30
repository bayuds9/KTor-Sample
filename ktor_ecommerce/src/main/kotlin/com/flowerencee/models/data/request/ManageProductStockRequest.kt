package com.flowerencee.models.data.request

data class ManageProductStockRequest(
    var productId : String = "",
    var stock: Int = 0,
    var sign: String = ""
)
