package com.flowerencee9.marketplace.model.networking.networkingsupport

import com.flowerencee9.marketplace.model.data.response.StatusResponse
import io.ktor.client.call.*
import io.ktor.client.statement.*

class MappingFailedResponse {
    suspend fun mappingFailedResponse(response: HttpResponse): StatusResponse {
        val failedResponse = response.body<StatusResponse?>()
        return if (failedResponse != null) response.body()
        else StatusResponse(response.status.value.toString(), response.status.description, false)
    }
}