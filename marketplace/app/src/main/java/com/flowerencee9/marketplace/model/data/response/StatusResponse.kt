package com.flowerencee9.marketplace.model.data.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class StatusResponse(
    @SerializedName("errorCode")
    var statusCode: String = "",
    @SerializedName("message")
    var statusMessage: String = "",
    @SerializedName("success")
    var success: Boolean = false
) : Parcelable