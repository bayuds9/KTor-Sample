package com.flowerencee9.marketplace.model.data.request

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RegisterRequest(
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var accountType: Int = 0,
    var phone: String = "",
    var address: String = "",
    var imagePath: String = "",
    var merchantRegisterRequest: MerchantRegisterRequest? = null
) : Parcelable
