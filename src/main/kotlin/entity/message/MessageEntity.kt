package entity.message

import entity.User
import kotlinx.serialization.Serializable
import types.MessageEntityType

@Serializable
data class MessageEntity(
    val type: MessageEntityType,
    val offset: Int,
    val length: Int,
    val url: String? = null,
    val user: User? = null,
    val language: String? = null
)
