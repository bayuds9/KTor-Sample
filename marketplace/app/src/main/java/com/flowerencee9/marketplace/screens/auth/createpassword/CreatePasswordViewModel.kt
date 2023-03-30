package com.flowerencee9.marketplace.screens.auth.createpassword

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.flowerencee9.marketplace.model.data.request.ChangePasswordRequest
import com.flowerencee9.marketplace.model.data.request.CreatePasswordRequest
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.repositories.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreatePasswordViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {
    val loading: LiveData<Boolean> get() = repository.loadingStates
    val status: LiveData<StatusResponse> get() = repository.statusResponse

    fun createPassword(pwd: CreatePasswordRequest) = repository.dummyCreatePassword(pwd)
    fun changePassword(pwd: ChangePasswordRequest) = repository.dummyChangePassword(pwd)
}