package com.flowerencee9.marketplace.support.utils

import com.flowerencee9.marketplace.support.base.BaseConstants.PARAM.Companion.IMAGE_DIRECTORY
import com.flowerencee9.marketplace.support.base.BaseConstants.PARAM.Companion.PUBLIC_IMAGE_DIRECTORY
import com.flowerencee9.marketplace.support.base.BaseConstants.PARAM.Companion.STORAGE_DIRECTORY

fun storageDirectory() = STORAGE_DIRECTORY
fun publicImageDirectory(withSlash: Boolean = true) : String {
    return when(withSlash){
        true -> "/" + storageDirectory() + IMAGE_DIRECTORY + PUBLIC_IMAGE_DIRECTORY + "/"
        else -> storageDirectory() + IMAGE_DIRECTORY + PUBLIC_IMAGE_DIRECTORY
    }
}