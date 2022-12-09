package com.flowerencee.models.repositories

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.UserListByDateRequest

interface UserRepository {
    fun loginUser(request: LoginRequest): Login?
    fun getUserById(accountId: String): UserAccount?
    fun getUserListByDate(request: UserListByDateRequest): List<UserAccount>
}