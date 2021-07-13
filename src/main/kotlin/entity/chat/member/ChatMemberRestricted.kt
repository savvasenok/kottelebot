package entity.chat.member

import entity.User
import types.ChatMemberType

data class ChatMemberRestricted(
    override val status: ChatMemberType,
    override val user: User,
    val isMember: Boolean,
    val canChangeInfo: Boolean,
    val canInviteUsers: Boolean,
    val canPinMessages: Boolean,
    val canSendMessages: Boolean,
    val canSendMediaMessages: Boolean,
    val canSendPolls: Boolean,
    val canAddWebPagePreviews: Boolean,
    val untilDate: Int
) : ChatMember(status, user)
