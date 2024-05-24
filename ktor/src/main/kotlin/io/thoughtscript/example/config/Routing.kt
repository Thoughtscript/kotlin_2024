package io.thoughtscript.example.config

import io.thoughtscript.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

// Like WebFlux Functional Routers
fun Application.configureRouting() {
    routing {
        exampleRouting()
    }
}