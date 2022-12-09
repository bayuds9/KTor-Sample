package com.flowerencee.plugins

import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.request.RegisterAccountRequest
import com.flowerencee.models.data.request.UpdateImageProfileRequest
import com.flowerencee.models.data.request.UserListByDateRequest
import com.flowerencee.models.data.response.LoginResponse
import com.flowerencee.models.data.response.ProfileByIdResponse
import com.flowerencee.models.data.response.StatusResponse
import com.flowerencee.models.data.response.UserListByDateResponse
import com.flowerencee.models.remote.ConfigRemote
import com.flowerencee.models.remote.UserRemote
import com.flowerencee.models.support.ConfigParam.CRED_NOT_FOUND
import com.flowerencee.models.support.ConfigParam.DUPLICATE_EMAIL
import com.flowerencee.models.support.ConfigParam.DUPLICATE_PHONE
import com.flowerencee.models.support.ConfigParam.FAILED_STORE_FILE
import com.flowerencee.models.support.ConfigParam.INVALID_CREDENTIAL
import com.flowerencee.models.support.ConfigParam.INVALID_INPUT_DATA
import com.flowerencee.models.support.ConfigParam.NO_DATA_ATTEMPT
import com.flowerencee.models.support.ConfigParam.UNKNOWN_ERROR
import com.flowerencee.models.support.ConfigParam.USER_ID_NOT_FOUND
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {


    routing {
        get("/") {
            call.respond("Hello World")
        }
        val userRemote = UserRemote()
        val configRemote = ConfigRemote()


        post("/login") {
            val request = call.receive<LoginRequest>()
            val user = userRemote.loginUser(request)
            val response = LoginResponse()
            if (user == null) {
                response.statusResponse = configRemote.getErrorResponse(INVALID_CREDENTIAL)
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            response.statusResponse = null
            response.loginData = user
            call.respond(HttpStatusCode.OK, response)
        }

        get("/user/{profileId}") {
            val profileId = call.parameters["profileId"]
            val response = ProfileByIdResponse()
            if (profileId == null) {
                response.statusResponse = configRemote.getErrorResponse(CRED_NOT_FOUND)
                call.respond(HttpStatusCode.NotFound, response)
                return@get
            }
            val user = userRemote.getUserById(profileId)
            if (user == null) {
                response.statusResponse = configRemote.getErrorResponse(USER_ID_NOT_FOUND)
                call.respond(HttpStatusCode.BadRequest, response)
            } else {
                response.statusResponse = null
                response.profileData = user
                call.respond(HttpStatusCode.OK, response)
            }
        }

        post("/userbydob") {
            val request = call.receive<UserListByDateRequest>()
            val response = UserListByDateResponse()
            val userList = userRemote.getUserListByDate(request)
            if (userList.isEmpty()) {
                response.statusResponse = configRemote.getErrorResponse(NO_DATA_ATTEMPT)
                call.respond(HttpStatusCode.BadRequest, response)
            } else {
                response.profileList = userList.toCollection(ArrayList())
                call.respond(HttpStatusCode.OK, response)
            }
        }

        post("/user/registeraccount") {
            val request = call.receive<RegisterAccountRequest>()
            val response: StatusResponse
            when {
                (request.name.isEmpty() || request.email.isEmpty() || request.password.isEmpty() || request.type == null || request.phone.isEmpty() || request.dob.isEmpty() || request.image64.isEmpty()) ||
                        (request.type == 1 && (request.merchantData == null || request.merchantData?.merchantName?.isEmpty() == true || request.merchantData?.merchantAddress?.isEmpty() == true)) -> {
                    response = configRemote.getErrorResponse(INVALID_INPUT_DATA) ?: StatusResponse()
                    call.respond(HttpStatusCode.BadRequest, response)
                    return@post
                }

                else -> {
                    val emailValid = userRemote.validateEmail(request.email)
                    val phoneValid = userRemote.validatePhone(request.phone)
                    println("validate email $emailValid")
                    println("validate phone $phoneValid")
                    when {
                        !emailValid -> {
                            response = configRemote.getErrorResponse(DUPLICATE_EMAIL) ?: StatusResponse()
                            call.respond(HttpStatusCode.BadRequest, response)
                            return@post
                        }

                        !phoneValid -> {
                            response = configRemote.getErrorResponse(DUPLICATE_PHONE) ?: StatusResponse()
                            call.respond(HttpStatusCode.BadRequest, response)
                            return@post
                        }
                    }
                }
            }
            val accountId = userRemote.registerAccount(request)
            if (accountId.isEmpty()) {
                response = configRemote.getErrorResponse(UNKNOWN_ERROR) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
                return@post
            } else {
                val storeImage = userRemote.storeImage(request.image64, accountId)
                println("success store image ")
                if (storeImage) {
                    response = StatusResponse(false, "SUCCESS")
                    call.respond(HttpStatusCode.OK, response)
                } else {
                    response = configRemote.getErrorResponse(FAILED_STORE_FILE) ?: StatusResponse()
                    call.respond(HttpStatusCode.ExpectationFailed, response)
                }
            }
        }

        post("/user/updateimage") {
            val request = call.receive<UpdateImageProfileRequest>()
            val response: StatusResponse
            if (request.base64Image.isEmpty()) {
                call.respond(HttpStatusCode.BadRequest, "invalid image")
                return@post
            }
            val storeImage = userRemote.storeImage(request.base64Image, request.profileId)
            if (storeImage) {
                response = StatusResponse(false, "Success")
                call.respond(HttpStatusCode.OK, response)
            } else {
                response = configRemote.getErrorResponse(FAILED_STORE_FILE) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
            }
        }
    }
}
