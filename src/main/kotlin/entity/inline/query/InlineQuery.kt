package entity.inline.query

import entity.Location
import entity.User

data class InlineQuery(
    val id: String,
    val from: User,
    val query: String,
    val offset: String,
    val chatType: String?,
    val location: Location?
)
