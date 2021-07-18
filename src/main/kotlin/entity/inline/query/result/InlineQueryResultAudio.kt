package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import entity.inline.keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode

@Serializable
data class InlineQueryResultAudio(
    override val id: String,
    @SerialName("audio_url") val audioUrl: String,
    val title: String,
    val caption: String?,
    @SerialName("parse_mode") val parseMode: ParseMode?,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>?,
    val performer: String?,
    @SerialName("audio_duration") val audioDuration: Int?,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.AUDIO
}
