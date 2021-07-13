package entity.botcommand.scope

import types.BotCommandScopeType

data class BotCommandScopeChatAdministrators(
    val charId: Double
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.CHAT_ADMINISTRATORS
}
