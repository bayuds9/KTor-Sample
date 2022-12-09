package com.flowerencee.models.remote

import com.flowerencee.models.data.response.StatusResponse
import com.flowerencee.models.databases.DatabaseManager
import com.flowerencee.models.repositories.ConfigRepository
import com.flowerencee.models.support.ConfigParam

class ConfigRemote : ConfigRepository {

    private val database = DatabaseManager()
    override fun getErrorResponse(param: String): StatusResponse? {
        return database.getConfig().firstOrNull { it.errorCode == param }?.let { StatusResponse(true, it.message, it.errorCode) }
    }
}