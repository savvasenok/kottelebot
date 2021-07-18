package entity

import entity.message.Message
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CallbackQuery(
    val id: String,
    val from: User,
    val message: Message? = null,
    @SerialName("inline_message_id") val inlineMessageId: String,
    @SerialName("chat_instance") val chatInstance: String,
    val data: String? = null,
    @SerialName("game_short_name") val gameShortName: String? = null
)
