package entity

data class PassportData(
    val data: ArrayList<EncryptedPassportElement>,
    val credentials: EncryptedCredentials
)
