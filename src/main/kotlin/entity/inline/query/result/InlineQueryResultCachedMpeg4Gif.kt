package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode

@Serializable
data class InlineQueryResultCachedMpeg4Gif(
    override val id: String,
    @SerialName("mpeg_4_file_id") val mpeg4FileId: String,
    val title: String?,
    val caption: String?,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.MPEG4GIF
}
