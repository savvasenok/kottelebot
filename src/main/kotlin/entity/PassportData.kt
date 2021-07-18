package entity

import kotlinx.serialization.Serializable

@Serializable
data class PassportData(
    val data: ArrayList<EncryptedPassportElement>,
    val credentials: EncryptedCredentials
)
