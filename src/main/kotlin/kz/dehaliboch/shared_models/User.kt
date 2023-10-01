package kz.dehaliboch.shared_models

import kz.dehaliboch.common.getCurrentDateTime

data class User(
    val login: String,
    val email : String,
    val password: String,
    val registerDate: String = getCurrentDateTime(),
)
