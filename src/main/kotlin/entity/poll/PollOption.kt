package entity.poll

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PollOption(
    val text: String,
    @SerialName("voter_count") val voterCount: Int
)
