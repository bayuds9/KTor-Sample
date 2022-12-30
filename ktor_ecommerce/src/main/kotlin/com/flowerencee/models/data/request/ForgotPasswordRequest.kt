package com.flowerencee.models.data.request

data class ForgotPasswordRequest(
    var email: String = "",
    var phone: String = ""
)
