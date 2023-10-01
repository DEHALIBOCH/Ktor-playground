package kz.dehaliboch.cache

import kz.dehaliboch.shared_models.User

object InMemoryCache {

    val usersList = mutableListOf<User>()

    val tokenList = mutableListOf<TokenCache>()
}