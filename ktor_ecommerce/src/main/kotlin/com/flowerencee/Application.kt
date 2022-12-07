package com.flowerencee

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.flowerencee.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "192.168.1.10", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureHTTP()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
