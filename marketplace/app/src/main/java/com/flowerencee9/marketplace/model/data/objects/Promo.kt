package com.flowerencee9.marketplace.model.data.objects

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Promo(
    var promoId: String = "",
    var promoImage: String = "",
    var promoDate: String = ""
) : Parcelable
