package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType

data class InlineQueryResultGame(
    override val id: String,
    val gameShortName: String,
    val replyMarkup: InlineKeyboardMarkup?
): InlineQueryResult() {
    override val type = InlineQueryResultType.GAME
}
