package entity.inline.query

import entity.Location
import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InlineQuery(
    val id: String,
    val from: User,
    val query: String,
    val offset: String,
    @SerialName("chat_type") val chatType: String? = null,
    val location: Location? = null
)
