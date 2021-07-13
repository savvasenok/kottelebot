package entity

import entity.message.Message

data class CallbackQuery(
    val id: String,
    val from: User,
    val message: Message?,
    val inlineMessageId: String,
    val chatInstance: String,
    val data: String?,
    val gameShortName: String?
)
