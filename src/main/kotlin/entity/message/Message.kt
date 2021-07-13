package entity.message

import entity.*
import entity.chat.Chat
import entity.game.Game
import entity.inline.keyboard.InlineKeyboardMarkup
import entity.media.*
import entity.poll.Poll
import entity.sticker.Sticker
import entity.video.Video
import entity.video.VideoNote
import entity.voice.*
import entity.voice.chat.VoiceChatEnded
import entity.voice.chat.VoiceChatParticipantsInvited
import entity.voice.chat.VoiceChatScheduled
import entity.voice.chat.VoiceChatStarted

// https://core.telegram.org/bots/api#message

data class Message(
    val messageId: Double,
    val from: User?,
    val senderChat: Chat?,
    val date: Int,
    val chat: Chat,
    val forwardFrom: User?,
    val forwardFromChat: Chat?,
    val forwardFromMessageId: Double,
    val forwardSignature: String?,
    val forwardSenderName: String?,
    val forwardDate: Int?,
    val replyToMessage: Message?,
    val viaBot: User?,
    val editDate: Int?,
    val mediaGroupId: String?,
    val authorSignature: String?,
    val text: String?,
    val entities: ArrayList<MessageEntity>?,
    val animation: Animation?,
    val audio: Audio?,
    val document: Document?,
    val photo: ArrayList<PhotoSize>?,
    val sticker: Sticker?,
    val video: Video?,
    val videoNote: VideoNote?,
    val voice: Voice?,
    val caption: String?,
    val captionEntities: ArrayList<MessageEntity>?,
    val contact: Contact?,
    val dice: Dice?,
    val game: Game?,
    val poll: Poll?,
    val venue: Venue?,
    val location: Location?,
    val newChatMembers: ArrayList<User>?,
    val leftChatMembers: ArrayList<User>?,
    val newChatTitle: String?,
    val newChatPhoto: ArrayList<PhotoSize>,
    val deleteChatPhoto: Boolean?,
    val groupChatCreated: Boolean?,
    val supergroupChatCreated: Boolean?,
    val channelChatCreated: Boolean?,
    val messageAutoDeleteTimerChanged: MessageAutoDeleteTimerChanged?,
    val migrateToChatId: Double?,
    val migrateFromChatId: Double?,
    val pinnedMessage: Message?,
    val invoice: Invoice?,
    val successfulPayment: SuccessfulPayment?,
    val connectedWebsite: String?,
    val passportData: PassportData?,
    val proximityAlertTriggered: ProximityAlertTriggered?,
    val voiceChatScheduled: VoiceChatScheduled?,
    val voiceChatStarted: VoiceChatStarted?,
    val voiceChatEnded: VoiceChatEnded?,
    val voiceChatParticipantsInvited: VoiceChatParticipantsInvited?,
    val replyMarkup: InlineKeyboardMarkup?
)
