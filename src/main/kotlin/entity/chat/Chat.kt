package entity.chat

import entity.message.Message
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.ChatType

// https://core.telegram.org/bots/api#chat

@Serializable
data class Chat(
    val id: Long,
    val type: ChatType,
    val title: String? = null,
    val username: String? = null,
    @SerialName("first_name") val firstName: String? = null,
    @SerialName("last_name") val lastName: String? = null,
    val photo: ChatPhoto? = null,
    val bio: String? = null,
    val description: String? = null,
    @SerialName("invite_link") val inviteLink: String? = null,
    @SerialName("pinned_message") val pinnedMessage: Message? = null,
    val permissions: ChatPermissions? = null,
    @SerialName("slow_mode_delay") val slowModeDelay: Int? = null,
    @SerialName("message_auto_delete_time") val messageAutoDeleteTime: Int? = null,
    @SerialName("sticker_set_name") val stickerSetName: String? = null,
    @SerialName("can_set_sticker_set") val canSetStickerSet: Boolean? = null,
    @SerialName("linked_chat_id") val linkedChatId: Double? = null,
    val location: ChatLocation? = null
)
