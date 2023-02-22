package com.flowerencee9.marketplace.model.data.response


import com.google.gson.annotations.SerializedName

data class ProfileDataResponse(
    @SerializedName("profileData")
    var profileData: ProfileData? = ProfileData(),
    @SerializedName("statusResponse")
    var statusResponse: StatusResponse? = StatusResponse()
)