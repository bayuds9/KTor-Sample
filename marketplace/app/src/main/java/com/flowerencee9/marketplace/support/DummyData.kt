package com.flowerencee9.marketplace.support

import com.flowerencee9.marketplace.model.data.objects.Promo
import com.flowerencee9.marketplace.model.data.response.ProfileData

fun generateDummyPromo(size: Int) : ArrayList<Promo> {
    val data = ArrayList<Promo>()
    for (i in 1 until size) {
        data.add(Promo("idPromo$i"))
    }
    return data
}

fun dummyUserData() : ProfileData {
    return ProfileData(
        name = "dummy",
        address = "Jl. Magelang, no 20",
        dob = "12 September 1997",
        email = "dummy@mail.com",
        phone = "+6281234212321"
    )
}

