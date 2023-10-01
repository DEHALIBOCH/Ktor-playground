package kz.dehaliboch.feature.registration.models

data class ValidationResult(
    val isValid: Boolean = true,
    val message: String = "",
)
