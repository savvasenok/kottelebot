package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.inline.keyboard.InlineKeyboardMarkup
import types.InlineQueryResultType

data class InlineQueryResultArticle(
    override val id: String,
    val title: String,
    val inputMessageContent: InputMessageContent,
    val replyMarkup: InlineKeyboardMarkup?,
    val url: String?,
    val hideUrl: Boolean?,
    val description: String?,
    val thumbUrl: String?,
    val thumbWidth: Int?,
    val thumbHeight: Int?
) : InlineQueryResult() {
    override val type = InlineQueryResultType.ARTICLE
}
