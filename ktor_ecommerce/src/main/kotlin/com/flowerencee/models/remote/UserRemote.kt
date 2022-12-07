package com.flowerencee.models.remote

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.databases.DatabaseManager
import com.flowerencee.models.repositories.UserRepository


class UserRemote : UserRepository {

    private val database = DatabaseManager()
    override fun loginUser(request: LoginRequest): Login? {
        return database.loginUser(request)?.let { Login(it.id, it.type) }
    }

    override fun getUserById(accountId: String): UserAccount? {
        return database.getUserById(accountId)
    }

}