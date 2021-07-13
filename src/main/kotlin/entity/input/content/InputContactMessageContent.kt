package entity.input.content

data class InputContactMessageContent(
    val phoneNumber: String,
    val firstName: String,
    val lastName: String?,
    val vcard: String?
) : InputMessageContent()
