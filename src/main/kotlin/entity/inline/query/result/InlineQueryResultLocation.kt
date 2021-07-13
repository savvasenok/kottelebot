package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import types.InlineQueryResultType

data class InlineQueryResultLocation(
    override val id: String,
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val horizontalAccuracy: Int?,
    val livePeriod: Int?,
    val heading: Int?,
    val proximityAlertRadius: Int?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?,
    val thumbUrl: String?,
    val thumbWidth: Int?,
    val thumbHeight: Int?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.LOCATION
}
