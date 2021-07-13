package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.DocumentMimeType
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultDocument(
    override val id: String,
    val title: String,
    val documentUrl: String,
    val mimeType: DocumentMimeType,
    val description: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup,
    val inputMessageContent: InputMessageContent?,
    val thumbUrl: String?,
    val thumbWidth: Int?,
    val thumbHeight: Int?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.VOICE
}
