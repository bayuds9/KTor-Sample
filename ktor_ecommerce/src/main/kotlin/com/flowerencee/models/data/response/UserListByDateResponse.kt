package com.flowerencee.models.data.response

import com.flowerencee.models.data.body.UserAccount

data class UserListByDateResponse(
    var profileList: ArrayList<UserAccount>? = null,
    var statusResponse: StatusResponse? = null
)
