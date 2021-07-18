package entity.voice.chat

import kotlinx.serialization.Serializable

@Serializable
data class VoiceChatEnded(
    val duration: Int
)
