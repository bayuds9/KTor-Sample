package com.flowerencee.models.support


object Constants {
    const val STORAGE_DIRECTORY = "storage"
    const val IMAGE_DIRECTORY = "/image"
    const val PUBLIC_IMAGE_DIRECTORY = "/public"
    const val USER_PROFILE = "/profile"
}

interface PARAMETERS {
    enum class PARAM_ID {
        PRODUCT, ACCOUNT, MERCHANT
    }
}