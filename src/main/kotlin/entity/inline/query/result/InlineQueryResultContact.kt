package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import types.InlineQueryResultType

data class InlineQueryResultContact(
    override val id: String,
    val phoneNumber: String,
    val firstName: String,
    val lastName: String?,
    val vcard: String?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?,
    val thumbUrl: String?,
    val thumbWidth: Int?,
    val thumbHeight: Int?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.CONTACT
}
