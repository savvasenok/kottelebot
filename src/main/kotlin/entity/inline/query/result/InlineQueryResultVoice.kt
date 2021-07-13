package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType
import types.ParseMode

data class InlineQueryResultVoice(
    override val id: String,
    val voiceUrl: String,
    val title: String,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val voiceDuration: Int?,
    val replyMarkup: InlineKeyboardMarkup,
    val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.VOICE
}
