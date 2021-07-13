package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.message.MessageEntity
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultCachedVideo(
    override val id: String,
    val videoFileId: String,
    val title: String,
    val description: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,

) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.VIDEO
}
