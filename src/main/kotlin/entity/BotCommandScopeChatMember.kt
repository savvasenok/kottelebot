package entity

import types.BotCommandScopeType

data class BotCommandScopeChatMember(
    val charId: Double,
    val userId: Double
) : BotCommandScope() {
    override val type = BotCommandScopeType.CHAT_MEMBER
}
