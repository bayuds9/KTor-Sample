package com.flowerencee.models.data.request

data class UpdateImageProfileRequest(
    val base64Image: String,
    val profileId: String
)
