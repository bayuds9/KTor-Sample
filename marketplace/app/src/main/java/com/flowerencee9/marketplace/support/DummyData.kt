package com.flowerencee9.marketplace.support

import android.util.Log
import com.flowerencee9.marketplace.model.data.objects.*
import com.flowerencee9.marketplace.model.data.response.ProfileData
import com.flowerencee9.marketplace.support.utils.getTimeNow

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

fun dummyTransactionList(limit: Int) : ArrayList<TParent> {
    val parentList = ArrayList<TParent>()
    for (i in 1..5) {
        val childList = ArrayList<TChild>()
        for (j in 1..4) {
            childList.add(
                TChild(
                    "id$i$j",
                    "product $i$j",
                    j,
                    2000
                ))
        }
        parentList.add(
            TParent(
                "TRX0000$i",
                "destination $i",
                getTimeNow("DD/MMM/YYYY | HH:mm"),
                "Godean",
                childList
            )
        )
    }
    Log.d("wkwk", "size origin $parentList")
    val trimSize = parentList.filterIndexed { index, _ -> index < limit }
    Log.d("wkwk", "size before $trimSize")
    return trimSize.toCollection(ArrayList())
}

fun generateDummyChats(size: Int) : ArrayList<User> {
    val data = ArrayList<User>()
    for (i in 1 until size) {
        data.add(User("id$i", "user $i"))
    }
    return data
}

fun generateDummyMessages(size: Int) : ArrayList<Message> {
    val data = ArrayList<Message>()
    for (i in 1 until size) {
        data.add(Message("id$i", if (i%3==0 || i%2 == 0) "user$i" else "dummyId", "", "message $i"))
    }
    return data
}

