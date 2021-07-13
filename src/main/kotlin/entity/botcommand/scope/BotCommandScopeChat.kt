package entity.botcommand.scope

import types.BotCommandScopeType

data class BotCommandScopeChat(
    val charId: Double
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.CHAT
}
