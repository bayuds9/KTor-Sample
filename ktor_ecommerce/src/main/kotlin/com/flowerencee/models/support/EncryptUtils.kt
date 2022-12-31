package com.flowerencee.models.support

import java.math.BigInteger
import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class EncryptUtils() {
    private fun getSHA(input: String): ByteArray {
        val md: MessageDigest = MessageDigest.getInstance("SHA-256")
        return md.digest(input.byteInputStream(StandardCharsets.UTF_8).readBytes())
    }

    private fun ByteArray.toHexString(): String {
        val number = BigInteger(1, this)
        val hexString = StringBuilder(number.toString(16))
        while (hexString.length < 64) {
            hexString.insert(0, '0')
        }
        return hexString.toString()
    }

    fun encrypt(string: String): String {
        val input = getSHA(string)
        return input.toHexString()
    }
}