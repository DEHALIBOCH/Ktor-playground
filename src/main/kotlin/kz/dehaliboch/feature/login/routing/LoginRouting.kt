package kz.dehaliboch.feature.login.routing

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.cache.InMemoryCache.tokenList
import kz.dehaliboch.cache.InMemoryCache.usersList
import kz.dehaliboch.cache.TokenCache
import kz.dehaliboch.feature.login.models.LoginRequest
import kz.dehaliboch.feature.login.models.LoginResponse
import java.util.*

fun Application.configureLoginRouting() {

    routing {
        post("/login") {
            val loginRequest = call.receive<LoginRequest>()

            if (usersList.map { it.email }.contains(loginRequest.email)) {
                val token = UUID.randomUUID().toString()
                tokenList.add(TokenCache(loginRequest.email, token))
                call.respond(LoginResponse(token))
                return@post
            }

            call.respond(HttpStatusCode.BadRequest)
        }
    }
}