package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EncryptedPassportElement(
    val type: String,
    val data: String?,
    @SerialName("phone_number") val phoneNumber: String?,
    val email: String?,
    val files: ArrayList<PassportFile>?,
    @SerialName("front_side") val frontSide: PassportFile?,
    @SerialName("reverse_side") val reverseSide: PassportFile?,
    val selfie: PassportFile?,
    val translation: ArrayList<PassportFile>?,
    val hash: String
)
