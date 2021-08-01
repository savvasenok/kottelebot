package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode
import types.ThumbMimeType

@Serializable
data class InlineQueryResultMpeg4Gif(
    override val id: String,
    @SerialName("mpeg_4_url") val mpeg4Url: String,
    @SerialName("mpeg_4_width") val mpeg4Width: Int? = null,
    @SerialName("mpeg_4_height") val mpeg4Height: Int? = null,
    @SerialName("mpeg_4_duration") val mpeg4Duration: Int? = null,
    @SerialName("thumb_url") val thumbUrl: String,
    @SerialName("thumb_mime_type") val thumbMimeType: ThumbMimeType? = ThumbMimeType.IMAGE_JPEG,
    val title: String? = null,
    val caption: String? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.MPEG4GIF
}
