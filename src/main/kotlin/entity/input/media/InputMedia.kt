package entity.input.media

import types.InputMediaType
import types.ParseMode

abstract class InputMedia {
    abstract val type: InputMediaType
    abstract val media: String
    abstract val caption: String?
    abstract val parseMode: ParseMode?
}
