package com.flowerencee9.marketplace.screens

import android.app.Application
import com.flowerencee9.marketplace.BuildConfig
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MarketplaceApp : Application() {
    companion object {
        var BASE_URL = BuildConfig.BASE_URL
    }
}