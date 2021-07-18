package entity.botcommand.scope

import kotlinx.serialization.Serializable
import types.BotCommandScopeType

@Serializable
data class BotCommandScopeAllGroupChats(
    private val placeholder: Unit = Unit
) : BotCommandScope() {
    override val type: BotCommandScopeType = BotCommandScopeType.ALL_GROUP_CHATS
}
