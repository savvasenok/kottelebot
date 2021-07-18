package entity.chat.member

import entity.User
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
data class ChatMemberLeft(
    override val status: ChatMemberType,
    override val user: User,
) : ChatMember()
