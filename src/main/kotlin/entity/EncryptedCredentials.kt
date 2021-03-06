package entity

import kotlinx.serialization.Serializable

@Serializable
data class EncryptedCredentials(
    val data: String,
    val hash: String,
    val secret: String
)