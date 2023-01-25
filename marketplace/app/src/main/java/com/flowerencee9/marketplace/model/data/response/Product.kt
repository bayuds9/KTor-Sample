package com.flowerencee9.marketplace.model.data.response


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
data class Product(
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("merchantId")
    var merchantId: String? = null,
    @SerializedName("productCategory")
    var productCategory: String? = null,
    @SerializedName("productDesc")
    var productDesc: String? = null,
    @SerializedName("productId")
    var productId: String? = null,
    @SerializedName("productImage")
    var productImage: List<ProductImage?>? = null,
    @SerializedName("productName")
    var productName: String? = null,
    @SerializedName("productPrice")
    var productPrice: Double? = null,
    @SerializedName("productStock")
    var productStock: Int? = null
) : Parcelable