package com.flowerencee.models.remote

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.RegisterAccountRequest
import com.flowerencee.models.data.request.UserListByDateRequest
import com.flowerencee.models.databases.DatabaseManager
import com.flowerencee.models.repositories.UserRepository
import com.flowerencee.plugins.convertToImageFile
import com.flowerencee.plugins.encodeFileToBase64
import com.flowerencee.plugins.profileDirectory


class UserRemote : UserRepository {

    private val database = DatabaseManager()
    override fun loginUser(request: LoginRequest): Login? {
        return database.loginUser(request)?.let { Login(it.id, it.type) }
    }

    override fun getUserById(accountId: String): UserAccount? {
        return database.getUserById(accountId)?.apply {
            val image64 = (profileDirectory() + "/" + imageFile).encodeFileToBase64()
            imageFile = image64
        }
    }

    override fun getUserListByDate(request: UserListByDateRequest): List<UserAccount> {
        return database.getUserListByDate(request)
    }

    override fun registerAccount(request: RegisterAccountRequest): String {
        return database.register(request)
    }

    override fun storeProfileImage(image64: String, profileId: String): Boolean {
        val store = image64.convertToImageFile(profileDirectory(), "image$profileId.png")
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