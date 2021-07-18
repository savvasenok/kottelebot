package entity.voice.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VoiceChatScheduled(
    @SerialName("start_date") val startDate: Int
)
