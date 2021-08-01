package entity.inline.query.result

import entity.message.MessageEntity
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode

@Serializable
data class InlineQueryResultCachedVideo(
    override val id: String,
    @SerialName("video_file_id") val videoFileId: String,
    val title: String,
    val description: String? = null,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,

    ) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.VIDEO
}
