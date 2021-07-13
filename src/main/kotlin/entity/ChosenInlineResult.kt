package entity

data class ChosenInlineResult(
    val resultId: String,
    val from: User,
    val location: Location?,
    val inlineMessageId: String?,
    val query: String
)
