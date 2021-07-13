package entity.chat.member

import entity.User
import types.ChatMemberType

abstract class ChatMember(
    open val status: ChatMemberType,
    open val user: User
)