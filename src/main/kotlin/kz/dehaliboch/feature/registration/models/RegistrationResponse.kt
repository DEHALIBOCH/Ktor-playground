package kz.dehaliboch.feature.registration.models

import kotlinx.serialization.Serializable

@Serializable
data class RegistrationResponse(
    val token: String,
)
