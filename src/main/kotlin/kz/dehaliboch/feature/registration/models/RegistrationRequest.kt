package kz.dehaliboch.feature.registration.models

import kotlinx.serialization.Serializable

@Serializable
data class RegistrationRequest(
    val login: String,
    val email: String,
    val password: String,
)