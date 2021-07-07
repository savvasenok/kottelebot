package entity

import types.InputMediaType
import types.ParseMode

data class InputMediaAnimation(
    val media: String,
    val thumb: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val width: Int?,
    val height: Int?,
    val duration: Int?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.ANIMATION
}
