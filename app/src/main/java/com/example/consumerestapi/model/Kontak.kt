package com.example.consumerestapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName(value = "email")
    val email: String,
    @SerialName(value = "noHp")
    val noHp: String,
)
