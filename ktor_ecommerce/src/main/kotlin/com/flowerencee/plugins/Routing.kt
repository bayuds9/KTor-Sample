package com.flowerencee.plugins

import com.flowerencee.models.data.request.LoginRequest
import com.flowerencee.models.data.response.LoginResponse
import com.flowerencee.models.data.response.ProfileByIdResponse
import com.flowerencee.models.data.response.StatusResponse
import com.flowerencee.models.remote.UserRemote
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


        post("/login") {
            val request = call.receive<LoginRequest>()
            val user = userRemote.loginUser(request)
            val response = LoginResponse()
            if (user == null) {
                response.statusResponse = StatusResponse()
                response.statusResponse?.apply {
                    error = true
                    message = "Credentials Invalid"
                    errorCode = "0001"
                }
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
                response.statusResponse = StatusResponse()
                response.statusResponse?.apply {
                    error = true
                    message = "Invalid User Id"
                    errorCode = "0002"
                }
                call.respond(HttpStatusCode.NotFound, response)
                return@get
            }
            val user = userRemote.getUserById(profileId)
            if (user == null) {
                response.statusResponse = StatusResponse()
                response.statusResponse?.apply {
                    error = true
                    message = "User Id Not Found"
                    errorCode = "0003"
                }
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
