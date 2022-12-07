package com.flowerencee.models.data.response

import com.flowerencee.models.data.body.UserAccount

data class ProfileByIdResponse(
    var profileData: UserAccount? = null,
    var statusResponse: StatusResponse? = null
)
