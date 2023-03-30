package com.flowerencee9.marketplace.screens.main.account

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.flowerencee9.marketplace.model.data.objects.PlainItem
import com.flowerencee9.marketplace.model.data.response.ProfileData
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(private val repository: UserRepository) : ViewModel() {
    val loadingStates: LiveData<Boolean> get() = repository.loadingStates
    val statusResponse: LiveData<StatusResponse> get() = repository.statusResponse
    val profileData : LiveData<ProfileData> get() = repository.profileData
    val listProfile : LiveData<ArrayList<PlainItem>> get() = repository.listProfile

    fun getUser() = repository.getDummyUser()
}