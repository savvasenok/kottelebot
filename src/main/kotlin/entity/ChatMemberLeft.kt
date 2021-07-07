package entity

import types.ChatMemberType

data class ChatMemberLeft(
    override val status: ChatMemberType,
    override val user: User,
) : ChatMember(status, user)
