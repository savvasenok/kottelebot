package entity.input.content

data class InputLocationMessageContent(
    val latitude: Float,
    val longitude: Float,
    val horizontalAccuracy: Int?,
    val livePeriod: Int?,
    val heading: Int?,
    val proximityAlertRadius: Int?
) : InputMessageContent()
