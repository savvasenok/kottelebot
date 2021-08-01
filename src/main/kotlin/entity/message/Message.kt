package entity.message

import entity.*
import entity.chat.Chat
import entity.game.Game
import entity.media.*
import entity.poll.Poll
import entity.sticker.Sticker
import entity.video.Video
import entity.video.VideoNote
import entity.voice.Voice
import entity.voice.chat.VoiceChatEnded
import entity.voice.chat.VoiceChatParticipantsInvited
import entity.voice.chat.VoiceChatScheduled
import entity.voice.chat.VoiceChatStarted
import keyboard.InlineKeyboardMarkup
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// https://core.telegram.org/bots/api#message

@Serializable
data class Message(
    @SerialName("message_id") val messageId: Long,
    val from: User? = null,
    @SerialName("sender_chat") val senderChat: Chat? = null,
    val date: Int,
    val chat: Chat,
    @SerialName("forward_from") val forwardFrom: User? = null,
    @SerialName("forward_from_chat") val forwardFromChat: Chat? = null,
    @SerialName("forward_from_message_id") val forwardFromMessageId: Long? = null,
    @SerialName("forward_signature") val forwardSignature: String? = null,
    @SerialName("forward_sender_name") val forwardSenderName: String? = null,
    @SerialName("forward_date") val forwardDate: Int? = null,
    @SerialName("reply_to_message") val replyToMessage: Message? = null,
    @SerialName("via_bot") val viaBot: User? = null,
    @SerialName("edit_date") val editDate: Int? = null,
    @SerialName("media_group_id") val mediaGroupId: String? = null,
    @SerialName("author_signature") val authorSignature: String? = null,
    val text: String? = null,
    val entities: ArrayList<MessageEntity>? = null,
    val animation: Animation? = null,
    val audio: Audio? = null,
    val document: Document? = null,
    val photo: ArrayList<PhotoSize>? = null,
    val sticker: Sticker? = null,
    val video: Video? = null,
    @SerialName("video_note") val videoNote: VideoNote? = null,
    val voice: Voice? = null,
    val caption: String? = null,
    @SerialName("caption_entities") val captionEntities: ArrayList<MessageEntity>? = null,
    val contact: Contact? = null,
    val dice: Dice? = null,
    val game: Game? = null,
    val poll: Poll? = null,
    val venue: Venue? = null,
    val location: Location? = null,
    @SerialName("new_chat_members") val newChatMembers: ArrayList<User>? = null,
    @SerialName("left_chat_members") val leftChatMembers: ArrayList<User>? = null,
    @SerialName("new_chat_title") val newChatTitle: String? = null,
    @SerialName("new_chat_photo") val newChatPhoto: ArrayList<PhotoSize>? = null,
    @SerialName("delete_chat_photo") val deleteChatPhoto: Boolean? = null,
    @SerialName("group_chat_created") val groupChatCreated: Boolean? = null,
    @SerialName("supergroup_chat_created") val supergroupChatCreated: Boolean? = null,
    @SerialName("channel_chat_created") val channelChatCreated: Boolean? = null,
    @SerialName("message_auto_delete_timer_changed") val messageAutoDeleteTimerChanged: MessageAutoDeleteTimerChanged? = null,
    @SerialName("migrate_to_chat_id") val migrateToChatId: Long? = null,
    @SerialName("migrate_from_chat_id") val migrateFromChatId: Long? = null,
    @SerialName("pinned_message") val pinnedMessage: Message? = null,
    val invoice: Invoice? = null,
    @SerialName("successful_payment") val successfulPayment: SuccessfulPayment? = null,
    @SerialName("connected_website") val connectedWebsite: String? = null,
    @SerialName("passport_data") val passportData: PassportData? = null,
    @SerialName("proximity_alert_triggered") val proximityAlertTriggered: ProximityAlertTriggered? = null,
    @SerialName("voice_chat_scheduled") val voiceChatScheduled: VoiceChatScheduled? = null,
    @SerialName("voice_chat_started") val voiceChatStarted: VoiceChatStarted? = null,
    @SerialName("voice_chat_ended") val voiceChatEnded: VoiceChatEnded? = null,
    @SerialName("voice_chat_participants_invited") val voiceChatParticipantsInvited: VoiceChatParticipantsInvited? = null,
    @SerialName("inline_keyboard_markup") val replyMarkup: InlineKeyboardMarkup? = null
)
