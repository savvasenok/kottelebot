package entity

import types.PollType

data class Poll(
    val id: String,
    val question: String,
    val options: ArrayList<PollOption>,
    val totalVoterCount: Int,
    val isClosed: Boolean,
    val isAnonymous: Boolean,
    val type: PollType,
    val allowsMultipleAnswers: Boolean,
    val correctOptionId: Int?,
    val explanation: String?,
    val explanationEntities: ArrayList<MessageEntity>?,
    val openPeriod: Int?,
    val closeData: Int?
)
