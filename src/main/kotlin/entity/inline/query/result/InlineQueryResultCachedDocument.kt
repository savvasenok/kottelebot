package entity.inline.query.result

import entity.inline.keyboard.InlineKeyboardMarkup
import entity.input.content.InputMessageContent
import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.InlineQueryResultType
import types.ParseMode

@Serializable
data class InlineQueryResultCachedDocument(
    override val id: String,
    val title: String,
    @SerialName("document_file_id") val documentFileId: String,
    val description: String? = null,
    val caption: String? = null,
    @SerialName("parse_mode") val parseMode: ParseMode? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    @SerialName("reply_markup") val replyMarkup: InlineKeyboardMarkup? = null,
    @SerialName("input_message_content") val inputMessageContent: InputMessageContent? = null
) : InlineQueryResult() {
    override val type: InlineQueryResultType = InlineQueryResultType.DOCUMENT
}
