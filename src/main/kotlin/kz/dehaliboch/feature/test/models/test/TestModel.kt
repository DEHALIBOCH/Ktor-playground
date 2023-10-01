package kz.dehaliboch.feature.test.models.test

import kotlinx.serialization.Serializable
import kz.dehaliboch.common.getCurrentDateTime

@Serializable
data class TestModel(
    val text : String = "Successful serialization",
    val date: String = getCurrentDateTime(),
)