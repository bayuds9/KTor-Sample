package com.flowerencee.models.data.response

import com.flowerencee.models.data.body.Product

data class ProductResponse(
    var product: Product? = null,
    var statusResponse: StatusResponse? = null
)
