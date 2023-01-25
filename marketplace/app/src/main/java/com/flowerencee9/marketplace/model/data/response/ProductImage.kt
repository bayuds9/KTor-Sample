package com.flowerencee9.marketplace.model.data.response


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductImage(
    @SerializedName("file64")
    var file64: String? = null,
    @SerializedName("fileName")
    var fileName: String? = null
) : Parcelable