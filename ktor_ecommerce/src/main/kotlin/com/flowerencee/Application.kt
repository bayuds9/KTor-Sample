package com.flowerencee

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.flowerencee.plugins.*

fun main() {
    val localHost = "192.168.1.9"
    embeddedServer(Netty, port = 8080, host = localHost, module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
