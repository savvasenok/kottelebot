package entity.inline.query.result

import entity.input.content.InputMessageContent
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType

@Serializable
data class InlineQueryResultContact(
    override val id: String,
    @SerialName("phone_number") val phoneNumber: String,
    @SerialName("first_name") val firstName: String,
    @SerialName("last_name") val lastName: String? = null,
    val vcard: String? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null,
    @SerialName("thumb_url") val thumbUrl: String? = null,
    @SerialName("thumb_width") val thumbWidth: Int? = null,
    @SerialName("thumb_height") val thumbHeight: Int? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.CONTACT
}
