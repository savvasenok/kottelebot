package entity.chat.member

import entity.User
import entity.chat.Chat
import entity.chat.ChatInviteLink

data class ChatMemberUpdated(
    val chat: Chat,
    val from: User,
    val date: Int,
    val oldChatMember: ChatMember,
    val newChatMember: ChatMember,
    val inviteLink: ChatInviteLink?
)
