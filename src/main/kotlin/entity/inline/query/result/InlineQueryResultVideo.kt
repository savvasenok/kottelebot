package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultVideo(
    override val id: String,
    val videoUrl: String,
    val mimeType: String,
    val thumbUrl: String,
    val title: String,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val videoWidth: Int?,
    val videoHeight: Int?,
    val videoDuration: Int?,
    val description: String?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.VIDEO
}
