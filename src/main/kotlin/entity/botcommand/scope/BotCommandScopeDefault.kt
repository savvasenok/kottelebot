package entity.botcommand.scope

import kotlinx.serialization.Serializable
import types.BotCommandScopeType

@Serializable
data class BotCommandScopeDefault(
    val type: BotCommandScopeType = BotCommandScopeType.DEFAULT
)
