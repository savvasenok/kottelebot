package entity

import types.ChatMemberType

data class ChatMemberAdministrator(
    override val status: ChatMemberType,
    override val user: User,
    val canBeEdited: Boolean,
    val isAnonymous: Boolean,
    val canManageChat: Boolean,
    val canDeleteMessages: Boolean,
    val canManageVoiceChats: Boolean,
    val canRestrictMembers: Boolean,
    val canPromoteMembers: Boolean,
    val canChangeInfo: Boolean,
    val canInviteUsers: Boolean,
    val canPostMessages: Boolean?,
    val canEditMessages: Boolean?,
    val canPinMessages: Boolean?,
    val customTitle: String?
) : ChatMember(status, user)