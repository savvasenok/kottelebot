package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultCachedGif(
    override val id: String,
    val gifFileId: String,
    val title: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.GIF
}
