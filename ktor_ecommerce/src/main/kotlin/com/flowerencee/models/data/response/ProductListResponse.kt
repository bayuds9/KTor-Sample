package com.flowerencee.models.data.response

import com.flowerencee.models.data.body.Product

data class ProductListResponse(
    var productList: ArrayList<Product>? = null,
    var statusResponse: StatusResponse? = null
)
