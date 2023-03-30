package com.flowerencee9.marketplace.support.utils

import android.content.Context
import android.content.SharedPreferences
import com.flowerencee9.marketplace.support.sealed.Pref

class SharedPref(context: Context) {
    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(Pref.NAME.value, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()
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
    return sharedPref.getString(Pref.USERID.value).isNotEmpty()
}

fun Context.getUserName(): String {
    val sharedPref = SharedPref(this)
    return sharedPref.getString(Pref.USERNAME.value)
}

fun Context.getUserId() = SharedPref(this).getString(Pref.USERID.value)

fun Context.getDeviceId(): String {
    val sharedPref = SharedPref(this)
    return sharedPref.getString(Pref.DEVICE.value)
}

fun Context.isUserSeller() = SharedPref(this).getBoolean(Pref.SELLER.value)

fun Context.removeUserPref() {
    val sharedPref = SharedPref(this)
    sharedPref.clear()
}