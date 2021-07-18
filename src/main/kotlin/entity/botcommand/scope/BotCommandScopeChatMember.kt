package entity.botcommand.scope

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.BotCommandScopeType

@Serializable
data class BotCommandScopeChatMember(
    @SerialName("chat_id") val chatId: Long,
    @SerialName("user_id") val userId: Long
) : BotCommandScope() {
    override val type = BotCommandScopeType.CHAT_MEMBER
}
