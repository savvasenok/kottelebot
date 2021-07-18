package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.FoursquareType
import types.GooglePlaceType
import types.InlineQueryResultType

@Serializable
data class InlineQueryResultVenue(
    override val id: String,
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val address: String,
    @SerialName("foursquare_id") val foursquareId: String? = null,
    @SerialName("foursquare_type") val foursquareType: FoursquareType? = null,
    @SerialName("google_place_id") val googlePlaceId: String? = null,
    @SerialName("google_place_type") val googlePlaceType: GooglePlaceType? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
    @SerialName("thumb_url") val thumbUrl: String? = null,
    @SerialName("thumb_width") val thumbWidth: Int? = null,
    @SerialName("thumb_height") val thumbHeight: Int? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.VENUE
}
