package com.flowerencee9.marketplace.model.networking.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import javax.inject.Inject

class CartRepository @Inject constructor(private val service: KtorService) {
    companion object {
        private val TAG = CartRepository::class.java.simpleName
    }

    private val _loadingStates: MutableLiveData<Boolean> = MutableLiveData()
    val loadingStates: LiveData<Boolean> get() = _loadingStates

    private val _statusResponse: MutableLiveData<StatusResponse> = MutableLiveData()
    val statusResponse: LiveData<StatusResponse> get() = _statusResponse


}