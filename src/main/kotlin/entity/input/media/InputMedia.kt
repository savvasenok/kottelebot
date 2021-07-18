package entity.input.media

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InputMediaType
import types.ParseMode

@Serializable
abstract class InputMedia {
    abstract val type: InputMediaType
    abstract val media: String
    abstract val caption: String?
    @SerialName("parse_mode") abstract val parseMode: ParseMode?
}
