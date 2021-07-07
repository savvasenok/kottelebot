package entity

data class PollAnswer(
    val pollId: Double,
    val user: User,
    val optionsIds: ArrayList<Double>
)
