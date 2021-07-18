package entity.chat.member

import entity.User
import entity.chat.Chat
import entity.chat.ChatInviteLink
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatMemberUpdated(
    val chat: Chat,
    val from: User,
    val date: Int,
    @SerialName("old_chat_member") val oldChatMember: ChatMember,
    @SerialName("new_chat_member") val newChatMember: ChatMember,
    @SerialName("chat_invite_link") val inviteLink: ChatInviteLink? = null
)
