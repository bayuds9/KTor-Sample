package com.flowerencee9.marketplace.model.data.objects

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartChild(
    var idProduct: String = "",
    var productName: String = "",
    var amount: Int = 0,
    var totalPrice: Int = 0,
    var isChecked: Boolean = false
) : Parcelable