package entity

data class ChatPermissions(
    val canSendMessages: Boolean,
    val canSendMediaMessages: Boolean,
    val canSendPolls: Boolean,
    val canSendOtherMessages: Boolean,
    val canAddWebPagePreviews: Boolean,
    val canChangeInfo: Boolean,
    val canInviteUsers: Boolean,
    val canPinMessages: Boolean
)
