package entity.input.media

import entity.message.MessageEntity
import types.InputMediaType
import types.ParseMode

data class InputMediaPhoto(
    override val media: String,
    override val caption: String?,
    override val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.PHOTO
}
