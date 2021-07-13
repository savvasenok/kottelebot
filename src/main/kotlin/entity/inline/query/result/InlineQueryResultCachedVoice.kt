package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultCachedVoice(
    override val id: String,
    val voiceFileId: String,
    val title: String,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val replyMarkup: InlineKeyboardMarkup?,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.VOICE
}
