package entity.chat.member

import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
data class ChatMemberOwner(
    override val status: ChatMemberType,
    override val user: User,
    @SerialName("is_anonymous") val isAnonymous: Boolean? = null,
    @SerialName("custom_title") val customTitle: String? = null
) : ChatMember()
