package com.flowerencee9.marketplace.support.sealed

import com.flowerencee9.marketplace.BuildConfig

sealed class Pref (val value: String) {
    object NAME : Pref(BuildConfig.APPLICATION_ID)
    object USERID : Pref("USERID")
    object USERNAME : Pref("USERNAME")
    object DEVICE : Pref("DEVICE")
    object SELLER : Pref("SELLER")
}
