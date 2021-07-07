package entity

import types.BotCommandScopeType

abstract class BotCommandScope {
    abstract val type: BotCommandScopeType
}