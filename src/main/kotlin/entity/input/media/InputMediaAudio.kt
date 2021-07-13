package entity.input.media

import entity.message.MessageEntity
import types.InputMediaType
import types.ParseMode

data class InputMediaAudio(
    override val media: String,
    override val caption: String?,
    override val parseMode: ParseMode?,
    val thumb: String?,
    val captionEntities: ArrayList<MessageEntity>?,
    val duration: Int?,
    val performer: String?,
    val title: String?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.AUDIO
}