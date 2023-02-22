package com.flowerencee9.marketplace.screens.main.explore

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.flowerencee9.marketplace.model.data.objects.Promo
import com.flowerencee9.marketplace.model.data.response.Product
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.repositories.ExploreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(private val repository: ExploreRepository) :
    ViewModel() {

    val loadingStates: LiveData<Boolean> get() = repository.loadingStates
    val statusResponse: LiveData<StatusResponse> get() = repository.statusResponse
    val discoverListResponse: LiveData<ArrayList<Product>> get() = repository.discoverListResponse
    val promoList: LiveData<ArrayList<Promo>> get() = repository.promo

    fun discoverProduct(merchId: String? = null) = repository.discoverProduct(merchId)

    fun getPromo() = repository.dummyPromo()
}