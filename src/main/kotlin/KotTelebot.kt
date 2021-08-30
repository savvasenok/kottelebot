import api.entity.TextMessage
import api.exception.KotTelebotException
import api.response.Response
import contract.ChatId
import contract.IApiService
import entity.message.Message
import entity.message.MessageEntity
import keyboard.Keyboard
import types.ParseMode

class KotTelebot(
    private val api: IApiService
) {
    private fun <T> handleResponseReturn(response: Response<T>): T {
        if (response.ok) {
            return response.result!!
        } else {
            throw KotTelebotException.create(response.errorCode!!, response.description!!)
        }
    }

    suspend fun sendMessage(
        chatId: ChatId,
        text: String,
        parseMode: ParseMode? = null,
        entities: List<MessageEntity>? = null,
        disableWebPagePreview: Boolean? = null,
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): Message {
        val response = api.sendMessage(
            TextMessage(
                chatId.chatId(),
                text,
                parseMode,
                entities,
                disableWebPagePreview,
                disableNotification,
                replyToMessageId,
                allowSendingWithoutReply,
                replyMarkup
            )
        )

        return handleResponseReturn(response)
    }
}