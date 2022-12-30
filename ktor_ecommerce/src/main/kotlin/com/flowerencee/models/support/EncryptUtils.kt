package com.flowerencee.models.support

import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec

const val encryptionKey = "ENCRYPTION_KEY"

fun String.cipherEncrypt(encryptionKey: String): String? {
    try {
        val secretKeySpec = SecretKeySpec(encryptionKey.toByteArray(), "AES")
        val iv = encryptionKey.toByteArray()
        val ivParameterSpec = IvParameterSpec(iv)

        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec)

        val encryptedValue = cipher.doFinal(this.toByteArray())
        /*val xx = Base64.getEncoder().encode(encryptedValue).toString()
        return Base64.encodeToString(encryptedValue, Base64.DEFAULT)*/
        return Base64.getEncoder().encode(encryptedValue).toString()
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

fun String.cipherDecrypt(encryptionKey: String): String? {
    try {
        val secretKeySpec = SecretKeySpec(encryptionKey.toByteArray(), "AES")
        val iv = encryptionKey.toByteArray()
        val ivParameterSpec = IvParameterSpec(iv)

        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec)

        /*val decodedValue = Base64.decode(this, Base64.DEFAULT)*/
        val decodedValue = Base64.getDecoder().decode(this)
        val decryptedValue = cipher.doFinal(decodedValue)
        return String(decryptedValue)
    } catch (e: Exception) {
        e.printStackTrace()

    }
    return null
}

object AESEncyption {

    const val secretKey = "tK5UTui+DPh8lIlBxya5XVsmeDCoUl6vHhdIESMB6sQ="
    const val salt = "QWlGNHNhMTJTQWZ2bGhpV3U=" // base64 decode => AiF4sa12SAfvlhiWu
    const val iv = "bVQzNFNhRkQ1Njc4UUFaWA==" // base64 decode => mT34SaFD5678QAZX

    fun encrypt(strToEncrypt: String) :  String?
    {
        try
        {
//            val ivParameterSpec = IvParameterSpec(Base64.decode(iv, Base64.DEFAULT))
            val ivParameterSpec = IvParameterSpec(Base64.getDecoder().decode(iv))

            val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
            /*val spec =  PBEKeySpec(secretKey.toCharArray(), Base64.decode(salt, Base64.DEFAULT), 10000, 256)*/
            val spec =  PBEKeySpec(secretKey.toCharArray(), Base64.getDecoder().decode(salt), 10000, 256)
            val tmp = factory.generateSecret(spec)
            val secretKey =  SecretKeySpec(tmp.encoded, "AES")

            val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding")
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec)
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.toByteArray(Charsets.UTF_8)))
        }
        catch (e: Exception)
        {
            println("Error while encrypting: $e")
        }
        return null
    }

    fun decrypt(strToDecrypt : String) : String? {
        try
        {

            val ivParameterSpec =  IvParameterSpec(Base64.getDecoder().decode(iv))

            val factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
            val spec =  PBEKeySpec(secretKey.toCharArray(), Base64.getDecoder().decode(salt), 10000, 256)
            val tmp = factory.generateSecret(spec);
            val secretKey =  SecretKeySpec(tmp.encoded, "AES")

            val cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            return  String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)))
        }
        catch (e : Exception) {
            println("Error while decrypting: $e");
        }
        return null
    }
}