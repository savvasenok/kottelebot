package entity.botcommand.scope

import types.BotCommandScopeType

data class BotCommandScopeAllPrivateChats(
    private val placeholder: Unit = Unit
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.ALL_PRIVATE_CHATS
}

