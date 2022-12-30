package com.flowerencee.models.repositories

import com.flowerencee.models.data.body.Login
import com.flowerencee.models.data.body.UserAccount
import com.flowerencee.models.data.request.ForgotPasswordRequest
import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.RegisterAccountRequest
import com.flowerencee.models.data.request.UserListByDateRequest

interface UserRepository {
    fun loginUser(request: LoginRequest) : Login?
    fun getUserById(accountId: String) : UserAccount?
    fun getUserListByDate(request: UserListByDateRequest) : List<UserAccount>
    fun registerAccount(request: RegisterAccountRequest) : String
    fun storeProfileImage(image64: String, profileId: String) : Boolean
    fun validateEmailNotRegistered(email: String): Boolean
    fun validatePhoneNotRegistered(phone: String): Boolean
    fun createPassword(newPassword: String, profileId: String) : Boolean
}