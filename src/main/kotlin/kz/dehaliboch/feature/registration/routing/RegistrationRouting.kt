package kz.dehaliboch.feature.registration.routing

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.feature.registration.models.RegistrationRequest
import kz.dehaliboch.feature.registration.validators.validate

fun Application.configureRegistrationRouting() {

    routing {
        post("/register") {
            val registrationRequest = call.receive<RegistrationRequest>()
            val validationResult = registrationRequest.validate()

            if (!validationResult.isValid) {
                call.respondText(validationResult.message)
                return@post
            }

            call.respond("Successful registration")
        }
    }
}