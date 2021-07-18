package entity.input.media

import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InputMediaType
import types.ParseMode

@Serializable
data class InputMediaAudio(
    override val media: String,
    override val caption: String? = null,
    @SerialName("parse_mode") override val parseMode: ParseMode? = null,
    val thumb: String? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    val duration: Int? = null,
    val performer: String? = null,
    val title: String? = null
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.AUDIO
}