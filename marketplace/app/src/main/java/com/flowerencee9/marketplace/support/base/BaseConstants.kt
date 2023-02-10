package com.flowerencee9.marketplace.support.base

object BaseConstants {

    interface ENDPOINT {
        companion object {
            const val DISCOVER = "product/getProductList"
        }
    }

    interface TEXT_VALUE_TYPE {
        companion object {
            const val VALUE_TEXT = 0
            const val VALUE_CURRENCY = 1
            const val VALUE_AMOUNT = 2
            const val VALUE_PHONE = 3

        }
    }

    interface PARAM {
        companion object {
            const val STORAGE_DIRECTORY = "storage"
            const val IMAGE_DIRECTORY = "/image"
            const val PUBLIC_IMAGE_DIRECTORY = "/public"
            const val USER_PROFILE = "/profile"
            const val PRODUCT = "/product"
        }
    }

    interface `ERROR-CODE` {
        companion object {
            const val NO_DATA_ATTEMPT = "0054"
        }
    }
}