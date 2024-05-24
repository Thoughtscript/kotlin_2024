package io.thoughtscript.example.config

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

// JSON auto-serialization - like Jackson library in Spring
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}