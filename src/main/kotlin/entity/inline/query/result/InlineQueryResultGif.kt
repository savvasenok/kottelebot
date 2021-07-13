package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultGif(
    override val id: String,
    val gifURL: String,
    val gifWidth: Int?,
    val gifHeight: Int?,
    val gifDuration: Int?,
    val thumbUrl: String?,
    val title: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.GIF

}
