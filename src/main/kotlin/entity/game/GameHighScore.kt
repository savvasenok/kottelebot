package entity.game

import entity.User

data class GameHighScore(
    val position: Int,
    val user: User,
    val score: Int
)
