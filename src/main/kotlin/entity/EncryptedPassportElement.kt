package entity

data class EncryptedPassportElement(
    val type: String,
    val data: String?,
    val phoneNumber: String?,
    val email: String?,
    val files: ArrayList<PassportFile>?,
    val frontSide: PassportFile?,
    val reverseSide: PassportFile?,
    val selfie: PassportFile?,
    val translation: ArrayList<PassportFile>?,
    val hash: String
)
