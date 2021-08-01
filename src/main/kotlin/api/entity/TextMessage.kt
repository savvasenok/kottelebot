package api.entity

import entity.message.MessageEntity
import keyboard.Keyboard
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ParseMode

@Serializable
data class TextMessage(
    @SerialName("chat_id") val chatId: String,
    val text: String,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    val entities: List<MessageEntity>? = null,
    @SerialName("disable_web_page_preview") val disableWebPagePreview: Boolean? = null,
    @SerialName("disable_notification") val disableNotification: Boolean? = null,
    @SerialName("reply_to_message_id") val replyToMessageId: Long? = null,
    @SerialName("allow_sending_without_reply") val allowSendingWithoutReply: Boolean? = null,
    @SerialName("reply_markup") val replyMarkup: Keyboard? = null
)
