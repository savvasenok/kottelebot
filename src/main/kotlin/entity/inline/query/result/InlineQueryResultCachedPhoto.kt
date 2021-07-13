package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultCachedPhoto(
    override val id: String,
    val photoFileId: String,
    val title: String?,
    val description: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.PHOTO
}