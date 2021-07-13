package entity.input.media

import entity.message.MessageEntity
import types.InputMediaType
import types.ParseMode

data class InputMediaDocument(
    override val media: String,
    override val caption: String?,
    override val parseMode: ParseMode?,
    val thumb: String?,
    val captionEntities: ArrayList<MessageEntity>,
    val disableContentTypeDetection: Boolean?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.DOCUMENT
}