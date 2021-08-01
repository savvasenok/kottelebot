package contract

import api.entity.ForwardMessage
import api.entity.TextMessage
import api.response.Response
import entity.message.Message
import entity.message.MessageEntity
import entity.message.MessageId
import keyboard.Keyboard
import types.ParseMode

interface IApiService {

    // TODO: replace big interface with few small ones

//    suspend fun getMe(token: String): String

    suspend fun sendMessage(
        message: TextMessage
    ): Response<Message>

    suspend fun forwardMessage(
        forwardMessage: ForwardMessage
    ): Response<Message>

    suspend fun copyMessage(
        chatId: ChatId,
        fromChatId: ChatId,
        messageId: Long,
        caption: String? = null,
        parseMode: ParseMode? = null,
        captionEntities: List<MessageEntity>? = null,
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): MessageId

    suspend fun sendPhoto(
        chatId: ChatId,
        photo: IPhoto,
        caption: String? = null,
        parseMode: ParseMode? = null,
        captionEntities: List<MessageEntity>? = null,
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): Message

    suspend fun sendAudio(
        chatId: ChatId,
        audio: IAudio,
        caption: String? = null,
        parseMode: ParseMode? = null,
        captionEntities: List<MessageEntity>? = null,
        duration: Int? = null,
        performer: String? = null,
        title: String? = null,
        // TODO: thumb
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): Message

    suspend fun sendDocument(
        chatId: ChatId,
        document: IDocument,
        // TODO: thumb
        caption: String? = null,
        parseMode: ParseMode? = null,
        captionEntities: List<MessageEntity>? = null,
        disableContentTypeDetection: Boolean? = null,
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): Message

    suspend fun sendVideo(
        chatId: ChatId,
        video: IVideo,
        duration: Int? = null,
        width: Int? = null,
        height: Int? = null,
        // TODO: thumb
        caption: String? = null,
        parseMode: ParseMode? = null,
        captionEntities: List<MessageEntity>? = null,
        supportsStreaming: Boolean? = null,
        disableNotification: Boolean? = null,
        replyToMessageId: Long? = null,
        allowSendingWithoutReply: Boolean? = null,
        replyMarkup: Keyboard? = null
    ): Message

    // sendAnimation
}