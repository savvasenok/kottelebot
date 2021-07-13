package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import types.FoursquareType
import types.GooglePlaceType
import types.InlineQueryResultType

data class InlineQueryResultVenue(
    override val id: String,
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val address: String,
    val foursquareId: String?,
    val foursquareType: FoursquareType?,
    val googlePlaceId: String?,
    val googlePlaceType: GooglePlaceType?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?,
    val thumbUrl: String?,
    val thumbWidth: Int?,
    val thumbHeight: Int?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.VENUE
}
