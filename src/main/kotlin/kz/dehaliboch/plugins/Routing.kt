package kz.dehaliboch.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.common.generateSampleArray
import kz.dehaliboch.models.test.TestModel

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(TestModel())
        }
        get("/sample_array") {
            call.respond(generateSampleArray())
        }
    }
}
