package entity

import types.InputMediaType
import types.ParseMode

data class InputMediaDocument(
    val media: String,
    val thumb: String?,
    val caption: String?,
    val parseMode: ParseMode?,
    val captionEntities: ArrayList<MessageEntity>,
    val disableContentTypeDetection: Boolean?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.DOCUMENT
}