package com.flowerencee9.marketplace.model.data.response


import com.google.gson.annotations.SerializedName

data class ProfileData(
    @SerializedName("address")
    var address: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("imageFile")
    var imageFile: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("dob")
    var dob: String? = null
)