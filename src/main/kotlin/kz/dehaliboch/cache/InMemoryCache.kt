package kz.dehaliboch.cache

import kz.dehaliboch.feature.registration.models.RegistrationRequest

object InMemoryCache {

    val usersList = mutableListOf<RegistrationRequest>()
    val tokenList = mutableListOf<TokenCache>()
}