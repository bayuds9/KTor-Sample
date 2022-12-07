package com.flowerencee.models.data.response

data class StatusResponse(
    var error: Boolean = true,
    var message: String = "",
    var errorCode: String = ""
)
