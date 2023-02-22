package com.flowerencee9.marketplace.model.data.objects

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartParent(
    var idBook: String = "",
    var storeName: String = "",
    var storeId: String = "",
    var totalPrice: Int = 0,
    var products : ArrayList<CartChild> = arrayListOf(),
    var isCheck : Boolean = false
) : Parcelable
