package kz.dehaliboch.models.test

import kotlinx.serialization.Serializable
import kz.dehaliboch.common.getCurrentDateTime
import java.util.Date

@Serializable
data class TestModel(
    val text : String = "Successful serialization",
    val date: String = getCurrentDateTime(),
)