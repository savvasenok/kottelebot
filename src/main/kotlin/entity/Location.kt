package entity

data class Location(
    val longitude: Float,
    val latitude: Float,
    val horizontalAccuracy: Int?,
    val livePeriod: Int?,
    val heading: Int?,
    val proximityAlertRadius: Int?
)
