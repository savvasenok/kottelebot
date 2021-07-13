package entity.input.media

import entity.message.MessageEntity
import types.InputMediaType
import types.ParseMode

data class InputMediaVideo(
    override val media: String,
    override val caption: String?,
    override val parseMode: ParseMode?,
    val thumb: String?,
    val captionEntities: ArrayList<MessageEntity>?,
    val width: Int?,
    val height: Int?,
    val duration: Int?,
    val supportsStreaming: Boolean?
) : InputMedia() {
    override val type: InputMediaType = InputMediaType.VIDEO
}
