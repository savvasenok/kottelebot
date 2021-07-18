package entity.chat.member

import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
data class ChatMemberAdministrator(
    override val status: ChatMemberType,
    override val user: User,
    @SerialName("can_be_edited") val canBeEdited: Boolean,
    @SerialName("is_anonymous") val isAnonymous: Boolean,
    @SerialName("can_manage_chat") val canManageChat: Boolean,
    @SerialName("can_delete_messages") val canDeleteMessages: Boolean,
    @SerialName("can_manage_voice_chats") val canManageVoiceChats: Boolean,
    @SerialName("can_restrict_members") val canRestrictMembers: Boolean,
    @SerialName("can_promote_members") val canPromoteMembers: Boolean,
    @SerialName("can_change_info") val canChangeInfo: Boolean,
    @SerialName("can_invite_users") val canInviteUsers: Boolean,
    @SerialName("can_post_messages") val canPostMessages: Boolean? = null,
    @SerialName("can_edit_messages") val canEditMessages: Boolean? = null,
    @SerialName("can_pin_messages") val canPinMessages: Boolean? = null,
    @SerialName("custom_title") val customTitle: String? = null
) : ChatMember()