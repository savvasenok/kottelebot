package entity.input.media

import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InputMediaType
import types.ParseMode

@Serializable
data class InputMediaPhoto(
    override val media: String,
    override val caption: String? = null,
    @SerialName("parse_mode") override val parseMode: ParseMode? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.PHOTO
}
