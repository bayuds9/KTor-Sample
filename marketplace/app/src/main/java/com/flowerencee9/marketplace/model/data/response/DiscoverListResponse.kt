package com.flowerencee9.marketplace.model.data.response


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Parcelize
data class DiscoverListResponse(
    @SerializedName("productList")
    var productList: List<Product?>? = null
) : Parcelable