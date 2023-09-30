package kz.dehaliboch.feature.registration.routing

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.cache.InMemoryCache
import kz.dehaliboch.cache.InMemoryCache.usersList
import kz.dehaliboch.cache.TokenCache
import kz.dehaliboch.feature.registration.models.RegistrationRequest
import kz.dehaliboch.feature.registration.models.RegistrationResponse
import kz.dehaliboch.feature.registration.validators.validate
import java.util.*

fun Application.configureRegistrationRouting() {

    routing {
        post("/register") {
            val registrationRequest = call.receive<RegistrationRequest>()
            val validationResult = registrationRequest.validate()

            if (!validationResult.isValid) {
                call.respondText(validationResult.message)
                return@post
            }

            if (usersList.map { it.login }.contains(registrationRequest.login)) {
                call.respondText("Email already taken")
                return@post
            }

            val token = UUID.randomUUID().toString()
            InMemoryCache.tokenList.add(TokenCache(registrationRequest.login, token))

            call.respond(RegistrationResponse(token))
        }
    }
}