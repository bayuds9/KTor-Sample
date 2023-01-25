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
}