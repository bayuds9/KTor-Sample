package com.flowerencee9.marketplace

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MarketplaceApp : Application() {
    companion object {
        var BASE_URL = BuildConfig.BASE_URL
    }
}