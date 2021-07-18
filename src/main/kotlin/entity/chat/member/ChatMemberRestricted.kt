package entity.chat.member

import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
data class ChatMemberRestricted(
    override val status: ChatMemberType,
    override val user: User,
    @SerialName("is_member") val isMember: Boolean,
    @SerialName("can_change_info") val canChangeInfo: Boolean,
    @SerialName("can_invite_users") val canInviteUsers: Boolean,
    @SerialName("can_pin_messages") val canPinMessages: Boolean,
    @SerialName("can_send_messages") val canSendMessages: Boolean,
    @SerialName("can_send_media_messages") val canSendMediaMessages: Boolean,
    @SerialName("can_send_polls") val canSendPolls: Boolean,
    @SerialName("can_add_web_page_previews") val canAddWebPagePreviews: Boolean,
    @SerialName("until_date") val untilDate: Int
) : ChatMember()
