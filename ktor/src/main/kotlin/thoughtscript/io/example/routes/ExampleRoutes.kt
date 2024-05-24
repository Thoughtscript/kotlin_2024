package io.example.routes

import io.example.domain.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.exampleRouting() {
    route("/example") {
        // Set subpaths here
        get("/all") {
            if (exampleStorage.isNotEmpty()) {
                call.respond(exampleStorage)

            } else {
                call.respondText("No examples found", status = HttpStatusCode.OK)
            }
        }

        // URL Context Path Param
        // e.g. - /example/200
        get("{id?}") {
            val id = call.parameters["id"] ?: return@get call.respondText(
                    "Missing id",
                    status = HttpStatusCode.BadRequest
            )

            // This returns the first match
            val example =
                    // handle null case
                    exampleStorage.find { it.id == id } ?: return@get call.respondText(
                            "No example with id $id",
                            status = HttpStatusCode.NotFound
                    )

            call.respond(example)
        }

        post {
            val example = call.receive<Example>()
            val lookup = exampleStorage.find { it.id == example.id }

            // System.out.println or console.log equivalent
            // println(lookup)

            // https://stackoverflow.com/questions/37231560/best-way-to-null-check-in-kotlin
            // handle non-null case with 'Safe Call Operator'
            lookup?.let {
                // passes the value to the left into this scope and makes it available as 'it'
                call.respondText("Example already exists", status = HttpStatusCode.BadRequest)

            // chain and handle null case with 'Elvis Operator'
            } ?: run {
                exampleStorage.add(example)
                call.respondText("Example stored correctly", status = HttpStatusCode.Created)
            }
        }

        // URL Context Path Param
        // e.g. - /example/200
        delete("{id?}") {
            val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
            if (exampleStorage.removeIf { it.id == id }) {
                call.respondText("Example removed correctly", status = HttpStatusCode.Accepted)

            } else {
                call.respondText("Not Found", status = HttpStatusCode.NotFound)
            }
        }
    }
}