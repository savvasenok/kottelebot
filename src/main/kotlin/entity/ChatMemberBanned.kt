package entity

import types.ChatMemberType

data class ChatMemberBanned(
    override val status: ChatMemberType,
    override val user: User,
    val untilDate: Int
) : ChatMember(status, user)
