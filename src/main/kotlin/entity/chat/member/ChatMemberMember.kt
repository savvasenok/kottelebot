package entity.chat.member

import entity.User
import types.ChatMemberType

data class ChatMemberMember(
    override val status: ChatMemberType,
    override val user: User
) : ChatMember(status, user)
