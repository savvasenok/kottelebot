package entity.chat.member

import entity.User
import types.ChatMemberType

data class ChatMemberOwner(
    override val status: ChatMemberType,
    override val user: User,
    val isAnonymous: Boolean?,
    val customTitle: String?
) : ChatMember(status, user)
