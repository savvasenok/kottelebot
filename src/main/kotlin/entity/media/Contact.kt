package entity.media

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Contact(
    @SerialName("phone_number") val phoneNumber: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("lastName") val lastName: String? = null,
    @SerialName("user_id") val userId: Double? = null,
    val vcard: String? = null
)