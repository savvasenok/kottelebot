package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType
import types.ParseMode
import types.ThumbMimeType

data class InlineQueryResultMpeg4Gif(
    override val id: String,
    val mpeg4Url: String,
    val mpeg4Width: Int?,
    val mpeg4Height: Int?,
    val mpeg4Duration: Int?,
    val thumbUrl: String,
    val thumbMimeType: ThumbMimeType? = ThumbMimeType.IMAGE_JPEG,
    val title: String?,
    val caption: String?,
    val captionEntities: ArrayList<MessageEntity>?,
    val parseMode: ParseMode?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.MPEG4GIF
}
