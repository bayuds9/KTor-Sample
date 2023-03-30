package com.flowerencee9.marketplace.model.data.objects

data class TParent(
    var tId: String = "",
    var destName: String = "",
    var date: String = "",
    var location: String = "",
    var childItem: ArrayList<TChild> = arrayListOf(),
    var expanded: Boolean = false
)
