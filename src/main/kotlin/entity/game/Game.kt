package entity.game

import entity.media.Animation
import entity.media.PhotoSize
import entity.message.MessageEntity

data class Game(
    val title: String,
    val description: String,
    val photo: ArrayList<PhotoSize>,
    val text: String?,
    val textEntities: ArrayList<MessageEntity>?,
    val animation: Animation?
)
