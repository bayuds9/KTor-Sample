package com.flowerencee9.marketplace.screens.main.summary

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.flowerencee9.marketplace.model.data.objects.TParent
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.repositories.ExploreRepository
import com.flowerencee9.marketplace.model.networking.repositories.TransactionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SummaryViewModel @Inject constructor(private val repository: TransactionRepository) : ViewModel() {
    val loadingStates: LiveData<Boolean> get() = repository.loadingStates
    val statusResponse: LiveData<StatusResponse> get() = repository.statusResponse
    val tProgress: LiveData<ArrayList<TParent>> get() = repository.tParentDataProgress
    val tWaiting: LiveData<ArrayList<TParent>> get() = repository.tParentDataWaiting
    val tFinished: LiveData<ArrayList<TParent>> get() = repository.tParentDataFinished

    fun getSummary() = repository.getDummySummary()
}