package com.flowerencee9.marketplace.support.utils

import android.content.Context
import android.content.SharedPreferences
import com.flowerencee9.marketplace.BuildConfig
import com.flowerencee9.marketplace.support.utils.PREF.Companion.DEVICE_ID
import com.flowerencee9.marketplace.support.utils.PREF.Companion.IS_SELLER
import com.flowerencee9.marketplace.support.utils.PREF.Companion.USER_ID
import com.flowerencee9.marketplace.support.utils.PREF.Companion.USER_NAME

interface PREF {
    companion object {
        const val NAME = BuildConfig.APPLICATION_ID
        const val USER_ID = "USER_ID"
        const val USER_NAME = "USER_NAME"
        const val DEVICE_ID = "DEVICE_ID"
        const val IS_SELLER = "IS_SELLER"
    }
}

class SharedPref(context: Context) {
    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF.NAME, Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor = sharedPreferences.edit()
    fun putString(key: String, value: String) {
        editor.putString(key, value)
            .apply()
    }

    fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value).apply()
    }

    fun clear() {
        editor.clear()
            .apply()
    }

    fun getString(key: String): String {
        return sharedPreferences.getString(key, "").toString()
    }

    fun getBoolean(key: String) = sharedPreferences.getBoolean(key, false)
}

fun Context.isLogin(): Boolean {
    val sharedPref = SharedPref(this)
    return sharedPref.getString(USER_ID).isNotEmpty()
}

fun Context.getUserName(): String {
    val sharedPref = SharedPref(this)
    return sharedPref.getString(USER_NAME)
}

fun Context.getUserId() = SharedPref(this).getString(USER_ID)

fun Context.getDeviceId(): String {
    val sharedPref = SharedPref(this)
    return sharedPref.getString(DEVICE_ID)
}

fun Context.isUserSeller() = SharedPref(this).getBoolean(IS_SELLER)

fun Context.removeUserPref() {
    val sharedPref = SharedPref(this)
    sharedPref.clear()
}