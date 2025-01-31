package com.flowerencee9.marketplace.model.networking.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagingData
import com.flowerencee9.marketplace.model.data.response.DiscoverListResponse
import com.flowerencee9.marketplace.model.data.response.StatusResponse
import com.flowerencee9.marketplace.model.networking.ktor.KtorService
import com.flowerencee9.marketplace.model.networking.networkingsupport.MappingFailedResponse
import com.flowerencee9.marketplace.support.base.BaseConstants
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainRepository @Inject constructor(private val service: KtorService) {
    private val TAG = MainRepository::class.java.simpleName

    private val _loadingStates: MutableLiveData<Boolean> = MutableLiveData()
    val loadingStates: LiveData<Boolean> get() = _loadingStates

    private val _statusResponse: MutableLiveData<StatusResponse> = MutableLiveData()
    val statusResponse: LiveData<StatusResponse> get() = _statusResponse

    private val _discoverListResponse: MutableLiveData<DiscoverListResponse> = MutableLiveData()
    val discoverListResponse get() = _discoverListResponse

    fun discoverProduct(merchantId: String? = null) {
        _loadingStates.value = true
        CoroutineScope(Dispatchers.Main).launch {
            val request = HttpRequestBuilder().apply {
                url {
                    path(BaseConstants.ENDPOINT.DISCOVER, merchantId.toString())
                }
                build()
            }
            val response = service.callGetHttp(request)
            when(response != null) {
                true -> response.let{
                    try {
                        when(it.status.isSuccess()){
                            true -> _discoverListResponse.value = it.body()
                            else -> _statusResponse.value = MappingFailedResponse().mappingFailedResponse(it)
                        }
                    } catch (e: JsonConvertException) {
                        e.printStackTrace()
                        _statusResponse.value =
                            StatusResponse(e.message.toString(), e.cause.toString(), false)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        _statusResponse.value =
                            StatusResponse(e.message.toString(), e.cause.toString(), false)
                    }
                }
                else -> _statusResponse.value = StatusResponse("Error Attempt", "Something Went Wrong", false)
            }
            _loadingStates.value = false
        }
    }
}