package entity

import types.InputMediaType
import types.ParseMode

data class InputMediaPhoto(
    val media: String,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.PHOTO
}
