package kz.dehaliboch.common

import kz.dehaliboch.models.test.TestModel
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun getCurrentDateTime(): String {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    return currentDateTime.format(formatter)
}

fun generateSampleArray() = List(10) { i -> TestModel(text = "Model № ${i + 1}") }
