package entity.inline.query.result

import types.InlineQueryResultType

abstract class InlineQueryResult {
    abstract val type: InlineQueryResultType
    abstract val id: String
}
