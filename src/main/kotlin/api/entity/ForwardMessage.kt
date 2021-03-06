package api.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForwardMessage(
    @SerialName("chat_id") val chatId: String,
    @SerialName("from_chat_id") val fromChatId: String,
    @SerialName("message_id") val messageId: Long,
    @SerialName("disable_notification") val disableNotification: Boolean?
)
