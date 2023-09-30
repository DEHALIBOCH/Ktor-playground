package kz.dehaliboch.feature.registration.validators

private const val MIN_LENGTH = 5

fun isLoginValid(login: String) = login.length >= MIN_LENGTH