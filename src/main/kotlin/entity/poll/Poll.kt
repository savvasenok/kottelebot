package entity.poll

import entity.message.MessageEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PollType

@Serializable
data class Poll(
    val id: String,
    val question: String,
    val options: ArrayList<PollOption>,
    @SerialName("total_voter_count") val totalVoterCount: Int,
    @SerialName("is_closed") val isClosed: Boolean,
    @SerialName("is_anonymous") val isAnonymous: Boolean,
    val type: PollType,
    @SerialName("allows_multiple_answers") val allowsMultipleAnswers: Boolean,
    @SerialName("correct_option_id") val correctOptionId: Int? = null,
    val explanation: String? = null,
    @SerialName("explanation_entities") val explanationEntities: ArrayList<MessageEntity>? = null,
    @SerialName("open_period") val openPeriod: Int? = null,
    @SerialName("close_data") val closeData: Int? = null
)
