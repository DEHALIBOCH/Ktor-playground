package kz.dehaliboch.feature.registration.validators

import kz.dehaliboch.feature.registration.models.RegistrationRequest
import kz.dehaliboch.feature.registration.models.ValidationResult

// TODO Переделать, функции по валидации должны возвращать ValidationResult, а в этой функции нужно просто собирать общий результат валид.
fun RegistrationRequest.validate() : ValidationResult {
    var validationResult = ValidationResult()

    if (!isLoginValid(login)) {
        validationResult = validationResult.copy(
            isValid = false,
            message = validationResult.message + "Login is not valid\n",
        )
    }

    if (!isEmailValid(email)) {
        validationResult = validationResult.copy(
            isValid = false,
            message = validationResult.message + "Email is not valid\n",
        )
    }

    if (!isPasswordValid(password)) {
        validationResult = validationResult.copy(
            isValid = false,
            message = validationResult.message + "Password is not valid\n"
        )
    }

    return validationResult
}