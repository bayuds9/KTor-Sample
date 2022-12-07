package com.flowerencee.models.repositories

import com.flowerencee.models.data.response.StatusResponse

interface ConfigRepository {
    fun getErrorResponse(param: String): StatusResponse?
}