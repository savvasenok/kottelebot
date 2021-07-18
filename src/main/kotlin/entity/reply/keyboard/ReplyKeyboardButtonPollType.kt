package entity.reply.keyboard

import kotlinx.serialization.Serializable
import types.PollType

@Serializable
data class ReplyKeyboardButtonPollType(
    val type: PollType
)
