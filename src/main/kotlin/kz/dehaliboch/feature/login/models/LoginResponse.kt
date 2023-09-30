package kz.dehaliboch.feature.login.models

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val token: String,
)