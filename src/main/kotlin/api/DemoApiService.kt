package api

import api.entity.ForwardMessage
import api.entity.TextMessage
import api.response.Response
import contract.*
import entity.message.Message
import entity.message.MessageEntity
import entity.message.MessageId
import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.http.ContentType.Application.Json
import keyboard.Keyboard
import types.ParseMode

// Use instance of this class, if you are not planning to create your own ApiService
class DemoApiService(
    private val endpointConfig: EndpointConfig,
    private val client: io.ktor.client.HttpClient
) : IApiService {

    override suspend fun sendMessage(
        message: TextMessage
    ): Response<Message> = client.post(endpointConfig.sendMessage) {
        contentType(Json)
        body = message
        expectSuccess = false
    }


    override suspend fun forwardMessage(
        forwardMessage: ForwardMessage
    ): Response<Message> = client.post(endpointConfig.forwardMessage) {
        contentType(Json)
        body = forwardMessage
        expectSuccess = false
    }

    override suspend fun copyMessage(
        chatId: ChatId,
        fromChatId: ChatId,
        messageId: Long,
        caption: String?,
        parseMode: ParseMode?,
        captionEntities: List<MessageEntity>?,
        disableNotification: Boolean?,
        replyToMessageId: Long?,
        allowSendingWithoutReply: Boolean?,
        replyMarkup: Keyboard?
    ): MessageId {
        TODO()
    }

    override suspend fun sendPhoto(
        chatId: ChatId,
        photo: IPhoto,
        caption: String?,
        parseMode: ParseMode?,
        captionEntities: List<MessageEntity>?,
        disableNotification: Boolean?,
        replyToMessageId: Long?,
        allowSendingWithoutReply: Boolean?,
        replyMarkup: Keyboard?
    ): Message {
        TODO()
    }

    override suspend fun sendAudio(
        chatId: ChatId,
        audio: IAudio,
        caption: String?,
        parseMode: ParseMode?,
        captionEntities: List<MessageEntity>?,
        duration: Int?,
        performer: String?,
        title: String?,
        // TODO: thumb
        disableNotification: Boolean?,
        replyToMessageId: Long?,
        allowSendingWithoutReply: Boolean?,
        replyMarkup: Keyboard?
    ): Message {
        TODO()
    }

    override suspend fun sendDocument(
        chatId: ChatId,
        document: IDocument,
        // TODO: thumb
        caption: String?,
        parseMode: ParseMode?,
        captionEntities: List<MessageEntity>?,
        disableContentTypeDetection: Boolean?,
        disableNotification: Boolean?,
        replyToMessageId: Long?,
        allowSendingWithoutReply: Boolean?,
        replyMarkup: Keyboard?
    ): Message {
        TODO()
    }

    override suspend fun sendVideo(
        chatId: ChatId,
        video: IVideo,
        duration: Int?,
        width: Int?,
        height: Int?,
        caption: String?,
        parseMode: ParseMode?,
        captionEntities: List<MessageEntity>?,
        supportsStreaming: Boolean?,
        disableNotification: Boolean?,
        replyToMessageId: Long?,
        allowSendingWithoutReply: Boolean?,
        replyMarkup: Keyboard?
    ): Message {
        TODO()
    }
}
