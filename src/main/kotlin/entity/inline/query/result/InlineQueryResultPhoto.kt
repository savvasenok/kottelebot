package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultPhoto(
    override val id: String,
    val photoUrl: String,
    val thumbUrl: String,
    val photoWidth: Int?,
    val photoHeight: Int?,
    val title: String?,
    val description: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent
) : InlineQueryResult() {
    override val type = InlineQueryResultType.PHOTO
}
