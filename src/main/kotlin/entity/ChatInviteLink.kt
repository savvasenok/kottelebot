package entity

data class ChatInviteLink(
    val inviteLink: String,
    val creator: User,
    val isPrimary: Boolean,
    val isRevoked: Boolean,
    val expireDate: Int?,
    val memberLimit: Int?,
)
