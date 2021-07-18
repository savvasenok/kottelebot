package entity.input.content

import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ParseMode

@Serializable
data class InputTextMessageContent(
    @SerialName("message_text") val messageText: String,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    val entities: ArrayList<MessageEntity>? = null,
    @SerialName("disable_web_page_preview") val disableWebPagePreview: Boolean? = null
) : InputMessageContent()
