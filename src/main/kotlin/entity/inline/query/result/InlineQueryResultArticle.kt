package entity.inline.query.result

import entity.input.content.InputMessageContent
import entity.inline.keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType

@Serializable
data class InlineQueryResultArticle(
    override val id: String,
    val title: String,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    val url: String? = null,
    @SerialName("hide_url") val hideUrl: Boolean? = null,
    val description: String? = null,
    @SerialName("thumb_url") val thumbUrl: String? = null,
    @SerialName("thumb_width") val thumbWidth: Int? = null,
    @SerialName("thumb_height") val thumbHeight: Int? = null
) : InlineQueryResult() {
    override val type = InlineQueryResultType.ARTICLE
}
