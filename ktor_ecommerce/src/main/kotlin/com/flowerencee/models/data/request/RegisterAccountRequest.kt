package com.flowerencee.models.data.request

data class RegisterAccountRequest(
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var type: Int? = null,
    var phone: String = "",
    var address: String = "",
    var dob: String = "",
    var image64: String = "",
    var imageName: String = "",
    var merchantData: RegisterMerchantRequest? = null
)
