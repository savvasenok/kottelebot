package entity.chat.member

import entity.User
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
abstract class ChatMember {
    abstract val status: ChatMemberType
    abstract val user: User
}