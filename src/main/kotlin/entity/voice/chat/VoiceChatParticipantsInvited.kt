package entity.voice.chat

import entity.User
import kotlinx.serialization.Serializable

@Serializable
data class VoiceChatParticipantsInvited(
    val users: ArrayList<User>? = null
)
