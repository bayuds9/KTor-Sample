package com.flowerencee.plugins

import com.flowerencee.models.support.Constants.IMAGE_DIRECTORY
import com.flowerencee.models.support.Constants.PUBLIC_IMAGE_DIRECTORY
import com.flowerencee.models.support.Constants.STORAGE_DIRECTORY
import com.flowerencee.models.support.Constants.USER_PROFILE
import io.ktor.util.*
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.text.SimpleDateFormat
import java.util.*
import kotlin.io.path.name

fun String.convertToImageFile(directoryPath: String, fileName: String): String? {
    return try {
        val pictureBytes = this.decodeBase64Bytes()
        val dir = File(directoryPath)
        if (!dir.exists()) dir.mkdirs()
        val nameOfFile = Files.write(Paths.get("${dir.absolutePath}/$fileName"), pictureBytes)
        nameOfFile.fileName.name
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun String.encodeFileToBase64(): String? {
    val file = File(this)
    return try {
        Base64.getEncoder().encodeToString(file.readBytes())
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun storageDirectory() = STORAGE_DIRECTORY
fun publicImageDirectory() = storageDirectory() + IMAGE_DIRECTORY + PUBLIC_IMAGE_DIRECTORY
fun profileDirectory() = publicImageDirectory() + USER_PROFILE
fun getTimeNow(format: String = "dd-MMM-yyy | HH:mm"): String {
    val calendar = Calendar.getInstance().time
    val value = SimpleDateFormat(format, Locale.getDefault())
    return value.format(calendar)
}
