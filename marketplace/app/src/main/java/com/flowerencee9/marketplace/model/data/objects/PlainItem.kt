package com.flowerencee9.marketplace.model.data.objects

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlainItem(
    var label: String = "",
    var textValue: String = "",
    var type: Int = 0
) : Parcelable
