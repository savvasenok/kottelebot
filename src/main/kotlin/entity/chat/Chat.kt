package entity.chat

import entity.message.Message
import types.ChatType

// https://core.telegram.org/bots/api#chat

data class Chat(
    val id: Double,
    val type: ChatType,
    val title: String?,
    val username: String?,
    val firstName: String?,
    val lastName: String?,
    val photo: ChatPhoto?,
    val bio: String?,
    val description: String?,
    val inviteLink: String?,
    val pinnedMessage: Message?,
    val permissions: ChatPermissions?,
    val slowModeDelay: Int?,
    val messageAutoDeleteTime: Int?,
    val stickerSetName: String?,
    val canSetStickerSet: Boolean?,
    val linkedChatId: Double?,
    val location: ChatLocation?
)
