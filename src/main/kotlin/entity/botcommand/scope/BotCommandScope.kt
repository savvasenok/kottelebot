package entity.botcommand.scope

import kotlinx.serialization.Serializable
import types.BotCommandScopeType

@Serializable
abstract class BotCommandScope {
    abstract val type: BotCommandScopeType
}