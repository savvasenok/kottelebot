package entity.botcommand.scope

import types.BotCommandScopeType

data class BotCommandScopeAllChatAdministrators(
    private val placeholder: Unit = Unit
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.ALL_CHAT_ADMINISTRATORS
}
