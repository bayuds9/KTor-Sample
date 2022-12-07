package com.flowerencee.plugins

import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.response.LoginResponse
import com.flowerencee.models.data.response.ProfileByIdResponse
import com.flowerencee.models.data.response.StatusResponse
import com.flowerencee.models.remote.ConfigRemote
import com.flowerencee.models.remote.UserRemote
import com.flowerencee.models.support.ConfigParam.CRED_NOT_FOUND
import com.flowerencee.models.support.ConfigParam.INVALID_CREDENTIAL
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
            }
            else {
                response.statusResponse = null
                response.profileData = user
                call.respond(HttpStatusCode.OK, response)
            }
        }

    }
}
