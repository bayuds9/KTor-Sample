package com.flowerencee9.marketplace.model.data.request

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MerchantRegisterRequest(
    var merchantName: String = "",
    var merchantAddress: String = "",
    var lat: Double? = null,
    var lon: Double? = null
) : Parcelable
