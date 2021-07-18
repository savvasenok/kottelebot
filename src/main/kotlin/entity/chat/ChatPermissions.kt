package entity.chat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatPermissions(
    @SerialName("can_send_messages") val canSendMessages: Boolean,
    @SerialName("can_send_media_messages") val canSendMediaMessages: Boolean,
    @SerialName("can_send_polls") val canSendPolls: Boolean,
    @SerialName("can_send_other_messages") val canSendOtherMessages: Boolean,
    @SerialName("can_add_web_page_previews") val canAddWebPagePreviews: Boolean,
    @SerialName("can_change_info") val canChangeInfo: Boolean,
    @SerialName("can_invite_users") val canInviteUsers: Boolean,
    @SerialName("can_pin_messages") val canPinMessages: Boolean
)
