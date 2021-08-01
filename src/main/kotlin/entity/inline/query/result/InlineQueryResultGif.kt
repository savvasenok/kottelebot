package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode

@Serializable
data class InlineQueryResultGif(
    override val id: String,
    @SerialName("gif_url") val gifURL: String,
    @SerialName("gif_width") val gifWidth: Int? = null,
    @SerialName("gif_height") val gifHeight: Int? = null,
    @SerialName("gif_duration") val gifDuration: Int? = null,
    @SerialName("thumb_url") val thumbUrl: String? = null,
    val title: String? = null,
    val caption: String? = null,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.GIF

}
