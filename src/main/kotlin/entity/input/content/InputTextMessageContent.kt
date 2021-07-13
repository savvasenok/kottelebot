package entity.input.content

import entity.message.MessageEntity
import types.ParseMode

data class InputTextMessageContent(
    val messageText: String,
    val parseMode: ParseMode?,
    val entities: ArrayList<MessageEntity>?,
    val disableWebPagePreview: Boolean?
) : InputMessageContent()
