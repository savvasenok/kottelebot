package entity.media

data class Contact(
    val phoneNumber: String,
    val firstName: String,
    val lastName: String?,
    val userId: Double?,
    val vcard: String?
)
