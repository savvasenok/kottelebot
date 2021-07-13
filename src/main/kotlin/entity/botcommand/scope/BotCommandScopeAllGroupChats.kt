package entity.botcommand.scope

import types.BotCommandScopeType

data class BotCommandScopeAllGroupChats(
    private val placeholder: Unit = Unit
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.ALL_GROUP_CHATS
}
