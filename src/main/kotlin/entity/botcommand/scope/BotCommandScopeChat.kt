package entity.botcommand.scope

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.BotCommandScopeType

@Serializable
data class BotCommandScopeChat(
    @SerialName("chat_id") val chatId: Double
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.CHAT
}
