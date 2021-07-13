package entity.poll

import entity.User

data class PollAnswer(
    val pollId: Double,
    val user: User,
    val optionsIds: ArrayList<Double>
)
