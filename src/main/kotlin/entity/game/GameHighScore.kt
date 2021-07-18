package entity.game

import entity.User
import kotlinx.serialization.Serializable

@Serializable
data class GameHighScore(
    val position: Int,
    val user: User,
    val score: Int
)
