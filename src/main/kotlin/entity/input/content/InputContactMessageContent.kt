package entity.input.content

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputContactMessageContent(
    @SerialName("phone_number") val phoneNumber: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("last_name") val lastName: String? = null,
    val vcard: String? = null
) : InputMessageContent()
