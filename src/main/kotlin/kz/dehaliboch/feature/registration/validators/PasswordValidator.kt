package kz.dehaliboch.feature.registration.validators

private const val MIN_LENGTH = 5
private val letterRegex = Regex("[a-zA-Z]")
private val digitRegex = Regex("[0-9]")

fun isPasswordValid(password: String) = password.length >= MIN_LENGTH
        && letterRegex.containsMatchIn(password)
        && digitRegex.containsMatchIn(password)