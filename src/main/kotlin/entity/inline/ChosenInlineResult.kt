package entity.inline

import entity.Location
import entity.User

data class ChosenInlineResult(
    val resultId: String,
    val from: User,
    val location: Location?,
    val inlineMessageId: String?,
    val query: String
)
