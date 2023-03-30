package com.flowerencee9.marketplace.model.data.request

data class ChangePasswordRequest(
    val userId: String,
    var oldPassword: String,
    val newPassword: String
)
