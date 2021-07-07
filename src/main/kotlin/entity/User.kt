package entity

// https://core.telegram.org/bots/api#user

data class User(
    val id: Double,
    val isBot: Boolean,
    val firstName: String,
    val lastName: String?,
    val username: String?,
    val languageCode: String?,
    val canJoinGroups: Boolean?,
    val canReadAllGroupMessages: Boolean?,
    val supportsInlineQueries: Boolean?
) {
    val fullName = if (lastName == null) firstName else "$firstName $lastName"
}
