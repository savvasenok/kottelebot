package entity.message

import entity.User
import types.MessageEntityType

data class MessageEntity(
    val type: MessageEntityType,
    val offset: Int,
    val length: Int,
    val url: String?,
    val user: User?,
    val language: String?
)
