package entity.message

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageId(
    @SerialName("message_id") val messageId: Long
)
