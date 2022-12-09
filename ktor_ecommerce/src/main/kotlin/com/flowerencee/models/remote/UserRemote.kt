package com.flowerencee.models.remote

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.RegisterAccountRequest
import com.flowerencee.models.data.request.UserListByDateRequest
import com.flowerencee.models.databases.DatabaseManager
import com.flowerencee.models.repositories.UserRepository
import com.flowerencee.models.support.Constants
import com.flowerencee.plugins.convertToFile


class UserRemote : UserRepository {

    private val database = DatabaseManager()
    override fun loginUser(request: LoginRequest): Login? {
        return database.loginUser(request)?.let { Login(it.id, it.type) }
    }

    override fun getUserById(accountId: String): UserAccount? {
        return database.getUserById(accountId)
    }

    override fun getUserListByDate(request: UserListByDateRequest): List<UserAccount> {
        return database.getUserListByDate(request)
    }

    override fun registerAccount(request: RegisterAccountRequest): String {
        return database.register(request)
    }

    override fun storeImage(image64: String, profileId: String): Boolean {
        val store = image64.convertToFile(Constants.PUBLIC_IMAGE_DIRECTORY, "image$profileId.png")
        println("store image $store")
        return if (store != null) database.updateProfileImage(store, profileId) else false
    }

    override fun validateEmail(email: String): Boolean {
        return database.checkEmail(email)
    }

    override fun validatePhone(phone: String): Boolean {
        return database.checkPhoneNumber(phone)
    }

}