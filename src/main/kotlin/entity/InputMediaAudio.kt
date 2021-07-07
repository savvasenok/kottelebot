package entity

import types.InputMediaType
import types.ParseMode

data class InputMediaAudio(
    val media: String,
    val thumb: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>?,
    val duration: Int?,
    val performer: String?,
    val title: String?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.AUDIO
}