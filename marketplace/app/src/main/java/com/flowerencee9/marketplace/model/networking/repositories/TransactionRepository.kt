package com.flowerencee9.marketplace.model.networking.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.flowerencee9.marketplace.model.data.objects.TParent
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.support.dummyTransactionList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class TransactionRepository @Inject constructor(private val service: KtorService) {
    private val TAG = TransactionRepository::class.java.simpleName

    private val _loadingStates: MutableLiveData<Boolean> = MutableLiveData()
    val loadingStates: LiveData<Boolean> get() = _loadingStates

    private val _statusResponse: MutableLiveData<StatusResponse> = MutableLiveData()
    val statusResponse: LiveData<StatusResponse> get() = _statusResponse


    private var _tParentDataWaiting : MutableLiveData<ArrayList<TParent>> = MutableLiveData()
    val tParentDataWaiting : LiveData<ArrayList<TParent>> get() = _tParentDataWaiting

    private var _tParentDataFinished : MutableLiveData<ArrayList<TParent>> = MutableLiveData()
    val tParentDataFinished : LiveData<ArrayList<TParent>> get() = _tParentDataFinished

    private var _tParentDataProgress : MutableLiveData<ArrayList<TParent>> = MutableLiveData()
    val tParentDataProgress : LiveData<ArrayList<TParent>> get() = _tParentDataProgress

    fun getDummySummary() {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            dummyTransactionList(2).let {
                _tParentDataProgress.value = it
                _tParentDataWaiting.value = it
                _tParentDataFinished.value = it
                delay(1000)
                _loadingStates.value = false
            }

        }
    }
}