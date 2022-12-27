package com.flowerencee.plugins

import com.flowerencee.models.data.request.*
import com.flowerencee.models.data.response.*
import com.flowerencee.models.remote.ConfigRemote
import com.flowerencee.models.remote.ProductRemote
import com.flowerencee.models.remote.UserRemote
import com.flowerencee.models.support.ConfigParam.CRED_NOT_FOUND
import com.flowerencee.models.support.ConfigParam.DUPLICATE_EMAIL
import com.flowerencee.models.support.ConfigParam.DUPLICATE_PHONE
import com.flowerencee.models.support.ConfigParam.FAILED_STORE_FILE
import com.flowerencee.models.support.ConfigParam.INVALID_CREDENTIAL
import com.flowerencee.models.support.ConfigParam.INVALID_INPUT_DATA
import com.flowerencee.models.support.ConfigParam.NO_DATA_ATTEMPT
import com.flowerencee.models.support.ConfigParam.PRODUCT_ID_NOT_FOUND
import com.flowerencee.models.support.ConfigParam.SUCCESS
import com.flowerencee.models.support.ConfigParam.UNKNOWN_ERROR
import com.flowerencee.models.support.ConfigParam.USER_ID_NOT_FOUND
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    val configRemote = ConfigRemote()
    val userRemote = UserRemote()
    val productRemote = ProductRemote()

    routing {
        get("/") {
            call.respond("Hello World")
        }

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
            val accountId = try {
                userRemote.registerAccount(request)
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            }
            if (accountId.isEmpty()) {
                response = configRemote.getErrorResponse(UNKNOWN_ERROR) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
                return@post
            } else {
                val storeImage = userRemote.storeProfileImage(request.image64, accountId)
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
                response = configRemote.getErrorResponse(NO_DATA_ATTEMPT) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val storeImage = userRemote.storeProfileImage(request.base64Image, request.profileId)
            if (storeImage) {
                response = StatusResponse(false, "Success")
                call.respond(HttpStatusCode.OK, response)
            } else {
                response = configRemote.getErrorResponse(FAILED_STORE_FILE) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
            }
        }
    }

    routing {

        post("/product/createProduct") {
            val request = call.receive<CreateProductRequest>()
            val response: StatusResponse
            val merchantValid = productRemote.validateMerchantId(request.merchantId)
            if (!merchantValid || request.name.isEmpty() || request.desc.isEmpty() || request.category.isEmpty() || request.price == 0.0 || request.stock == 0 || request.image.isEmpty()) {
                response = configRemote.getErrorResponse(INVALID_INPUT_DATA) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val productId = try {
                productRemote.createProduct(request)
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            }
            if (productId.isEmpty()) {
                response = configRemote.getErrorResponse(UNKNOWN_ERROR) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
                return@post
            }
            else {
                val storeProductImage = productRemote.storeProductImage(request.image, productId)
                println("storeproductimage $storeProductImage")
                if (storeProductImage) {
                    response = StatusResponse(false, "SUCCESS")
                    call.respond(HttpStatusCode.OK, response)
                } else {
                    response = configRemote.getErrorResponse(FAILED_STORE_FILE) ?: StatusResponse()
                    call.respond(HttpStatusCode.ExpectationFailed, response)
                }
            }

        }

        get("/product/getProductById/{productId}") {
            val productId = call.parameters["productId"]
            val response = ProductResponse()
            if (productId == null) {
                response.statusResponse = configRemote.getErrorResponse(PRODUCT_ID_NOT_FOUND)
                call.respond(HttpStatusCode.NotFound, response)
                return@get
            }
            val product = productRemote.getProduct(productId)
            if (product == null) {
                response.statusResponse = configRemote.getErrorResponse(UNKNOWN_ERROR)
                call.respond(HttpStatusCode.BadRequest, response)
            } else {
                response.product = product
                call.respond(HttpStatusCode.OK, response)
            }
        }

        get("/product/getProductList/{merchantId}") {
            val reqId = call.parameters["merchantId"]
            val productId = if (reqId == "null") null else call.parameters["merchantId"]
            val response = ProductListResponse()
            val product = productRemote.getProductList(productId)
            if (product.isEmpty()) {
                response.statusResponse = configRemote.getErrorResponse(NO_DATA_ATTEMPT)
                call.respond(HttpStatusCode.BadRequest, response)
            } else {
                response.productList = product
                call.respond(HttpStatusCode.OK, response)
            }
        }

        post("/product/deleteProductImage") {
            val request = call.receive<DropProductImageRequest>()
            val response : StatusResponse
            if (request.accountId.isEmpty() || request.merchantId.isEmpty() || request.productId.isEmpty() || request.imageName.isEmpty()) {
                response = configRemote.getErrorResponse(INVALID_INPUT_DATA) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val profileValid = productRemote.validateMerchantAccount(request.accountId, request.merchantId)
            val productValid = productRemote.validateProductData(request.productId, request.merchantId)
            if (!profileValid || !productValid) {
                response = configRemote.getErrorResponse(NO_DATA_ATTEMPT) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val execute = productRemote.deleteProductImage(request.imageName, request.productId)
            if (execute) {
                response = configRemote.getErrorResponse(SUCCESS) ?: StatusResponse(false, "Success", SUCCESS)
                call.respond(HttpStatusCode.OK, response)
            }
            else {
                response = configRemote.getErrorResponse(UNKNOWN_ERROR) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
            }
        }

        post("/product/addProductImage") {
            val request = call.receive<AddProductImageRequest>()
            val response : StatusResponse
            if (request.accountId.isEmpty() || request.merchantId.isEmpty() || request.productId.isEmpty() || request.image64.isEmpty()) {
                response = configRemote.getErrorResponse(INVALID_INPUT_DATA) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val profileValid = productRemote.validateMerchantAccount(request.accountId, request.merchantId)
            val productValid = productRemote.validateProductData(request.productId, request.merchantId)
            if (!profileValid || !productValid) {
                response = configRemote.getErrorResponse(NO_DATA_ATTEMPT) ?: StatusResponse()
                call.respond(HttpStatusCode.BadRequest, response)
                return@post
            }
            val storeProductImage = productRemote.storeProductImage(request.image64, request.productId)
            println("storeproductimage $storeProductImage")
            if (storeProductImage) {
                response = StatusResponse(false, "SUCCESS")
                call.respond(HttpStatusCode.OK, response)
            } else {
                response = configRemote.getErrorResponse(FAILED_STORE_FILE) ?: StatusResponse()
                call.respond(HttpStatusCode.ExpectationFailed, response)
            }

        }
    }
}
