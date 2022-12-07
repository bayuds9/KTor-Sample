package com.flowerencee.models.repositories

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.response.LoginResponse

interface UserRepository {
    fun loginUser(request: LoginRequest): Login?
}