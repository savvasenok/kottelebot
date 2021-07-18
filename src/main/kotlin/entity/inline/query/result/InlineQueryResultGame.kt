package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType

@Serializable
data class InlineQueryResultGame(
    override val id: String,
    @SerialName("game_short_name") val gameShortName: String,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.GAME
}
