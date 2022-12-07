package com.flowerencee.models.data.response

import com.flowerencee.models.data.body.Login

data class LoginResponse(
    var loginData : Login? = null,
    var statusResponse: StatusResponse? = null
)
