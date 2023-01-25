package com.flowerencee9.marketplace.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    val loadingStates: LiveData<Boolean> get() = repository.loadingStates
    val statusResponse: LiveData<StatusResponse> get() = repository.statusResponse
    val discoverListResponse get() = repository.discoverListResponse

    fun discoverProduct(merchId: String? = null) = repository.discoverProduct(merchId)
}