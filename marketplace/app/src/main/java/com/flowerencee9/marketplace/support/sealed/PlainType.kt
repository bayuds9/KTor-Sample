package com.flowerencee9.marketplace.support.sealed

sealed class PlainType(val value : Int) {
    object TEXT: PlainType(0)
    object CURRENCY: PlainType(1)
    object NUMBER: PlainType(2)
    object PHONE: PlainType(3)
}
