package entity.game

import entity.media.Animation
import entity.media.PhotoSize
import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Game(
    val title: String,
    val description: String,
    val photo: ArrayList<PhotoSize>,
    val text: String? = null,
    @SerialName("text_entities") val textEntities: ArrayList<MessageEntity>? = null,
    val animation: Animation? = null
)
