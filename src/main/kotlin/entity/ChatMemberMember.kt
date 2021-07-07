package entity

import types.ChatMemberType

data class ChatMemberMember(
    override val status: ChatMemberType,
    override val user: User
) : ChatMember(status, user)
