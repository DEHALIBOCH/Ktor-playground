package kz.dehaliboch.feature.registration.validators

private val emailRegex = Regex("^\\S+@\\S+\\.\\S+$")

fun isEmailValid(email: String) = emailRegex.matches(email)