package com.flowerencee9.marketplace.support.sealed

sealed class Trx(val value: String) {
    object WAITING: Trx("WAITING")
    object PROGRESS: Trx("PROGRESS")
    object FINISHED: Trx("FINISHED")
}