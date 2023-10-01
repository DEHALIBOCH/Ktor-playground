package kz.dehaliboch.feature.registration.mappers

import kz.dehaliboch.feature.registration.models.RegistrationRequest
import kz.dehaliboch.shared_models.User

fun RegistrationRequest.toUser() = User(
    login = login,
    email = email,
    password = password,
)