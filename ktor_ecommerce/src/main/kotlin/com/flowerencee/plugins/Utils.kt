package com.flowerencee.plugins

import com.flowerencee.models.support.Constants
import io.ktor.util.*
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.text.SimpleDateFormat
import java.util.*
import kotlin.io.path.name

fun String.convertToFile(directoryPath: String, fileName: String): String? {
    return try {
        val pictureBytes = this.decodeBase64Bytes()
        val dir = File(Constants.STORAGE_DIRECTORY + directoryPath)
        if (!dir.exists()) dir.mkdirs()
        val nameOfFile = Files.write(Paths.get("${dir.absolutePath}/$fileName"), pictureBytes)
        nameOfFile.fileName.name
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun encodeFileToBase64(directoryPath: String, fileName: String): String? {
    val file = File(Constants.STORAGE_DIRECTORY + directoryPath + fileName)
    return try {
        Base64.getEncoder().encodeToString(file.readBytes())
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
}

fun getTimeNow(format: String = "dd-MMM-yyy | HH:mm"): String {
    val calendar = Calendar.getInstance().time
    val value = SimpleDateFormat(format, Locale.getDefault())
    return value.format(calendar)
}
