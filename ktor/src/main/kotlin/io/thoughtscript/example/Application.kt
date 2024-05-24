package io.thoughtscript.example

import io.ktor.server.application.*
import io.thoughtscript.example.config.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    // Cool, config is initialized and set here
    configureRouting()
    configureSerialization()
}