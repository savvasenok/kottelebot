package entity.poll

import entity.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PollAnswer(
    @SerialName("poll_id") val pollId: Long,
    val user: User,
    @SerialName("options_ids") val optionsIds: ArrayList<Long>
)
