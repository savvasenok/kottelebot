package entity.inline.query.result

import kotlinx.serialization.Serializable
import types.InlineQueryResultType

@Serializable
abstract class InlineQueryResult {
    abstract val type: InlineQueryResultType
    abstract val id: String
}
