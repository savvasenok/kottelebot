package entity.inline.query.result

import entity.input.content.InputMessageContent
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType

@Serializable
data class InlineQueryResultLocation(
    override val id: String,
    val latitude: Float,
    val longitude: Float,
    val title: String,
    @SerialName("horizontal_accuracy") val horizontalAccuracy: Int? = null,
    @SerialName("live_period") val livePeriod: Int? = null,
    val heading: Int? = null,
    @SerialName("proximity_alert_radius") val proximityAlertRadius: Int? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
    @SerialName("thumb_url") val thumbUrl: String? = null,
    @SerialName("thumb_width") val thumbWidth: Int? = null,
    @SerialName("thumb_height") val thumbHeight: Int? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.LOCATION
}
