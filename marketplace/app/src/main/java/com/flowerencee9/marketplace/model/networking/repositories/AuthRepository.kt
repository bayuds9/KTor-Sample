package com.flowerencee9.marketplace.model.networking.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.flowerencee9.marketplace.model.data.request.*
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.support.sealed.Pref
import com.flowerencee9.marketplace.support.utils.SharedPref
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val service: KtorService,
    private val context: Context
) {
    companion object {
        private val TAG = AuthRepository::class.java.simpleName
    }

    private val _loadingStates: MutableLiveData<Boolean> = MutableLiveData()
    val loadingStates: LiveData<Boolean> get() = _loadingStates

    private val _statusResponse: MutableLiveData<StatusResponse> = MutableLiveData()
    val statusResponse: LiveData<StatusResponse> get() = _statusResponse

    fun dummyLogin(request: LoginRequest) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            if (request.password.length > 5) {
                val pref = SharedPref(context)
                with(pref) {
                    putString(Pref.USERID.value, "dummyId")
                    putString(Pref.USERNAME.value, "dummyName")
                    putBoolean(Pref.SELLER.value, request.email.endsWith("seller"))
                }
                _statusResponse.value = StatusResponse("200", "Success", true)
            } else _statusResponse.value = StatusResponse("401", "Invalid", false)
            delay(1000)
            _loadingStates.value = false
        }
    }

    fun dummyRegister(request: RegisterRequest) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _statusResponse.value = StatusResponse("200", "SUCCESS", true)
            delay(1000)
            _loadingStates.value = false
        }
    }

    fun dummyForgotPassword(request: ForgotPasswordRequest) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _statusResponse.value = StatusResponse("200", "SUCCESS", true)
            delay(1000)
            _loadingStates.value = false
        }
    }

    fun dummyOtp(value: String) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _statusResponse.value = StatusResponse("200", "SUCCESS", true)
            delay(1000)
            _loadingStates.value = false
        }
    }

    fun dummyCreatePassword(pwd: CreatePasswordRequest) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _statusResponse.value = StatusResponse("200", "SUCCESS", true)
            delay(1000)
            _loadingStates.value = false
        }
    }

    fun dummyChangePassword(pwd: ChangePasswordRequest) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            _statusResponse.value = StatusResponse("200", "SUCCESS", true)
            delay(1000)
            _loadingStates.value = false
        }
    }
}