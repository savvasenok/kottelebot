package entity.input.content

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputLocationMessageContent(
    val latitude: Float,
    val longitude: Float,
    @SerialName("horizontal_accuracy") val horizontalAccuracy: Int? = null,
    @SerialName("live_period") val livePeriod: Int? = null,
    val heading: Int? = null,
    @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null
) : InputMessageContent()
