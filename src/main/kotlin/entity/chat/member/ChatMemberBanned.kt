package entity.chat.member

import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatMemberType

@Serializable
data class ChatMemberBanned(
    override val status: ChatMemberType,
    override val user: User,
    @SerialName("until_date") val untilDate: Int
) : ChatMember()
