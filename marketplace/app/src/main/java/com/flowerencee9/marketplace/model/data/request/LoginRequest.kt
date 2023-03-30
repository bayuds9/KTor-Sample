package com.flowerencee9.marketplace.model.data.request

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginRequest(
    var email: String = "",
    var password: String = ""
) : Parcelable
