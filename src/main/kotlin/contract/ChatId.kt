package contract

import kotlinx.serialization.Serializable

@Serializable
sealed class ChatId {

    abstract fun chatId(): String

    @Serializable
    class NumberId(val id: Long) : ChatId() {
        override fun chatId(): String = id.toString()
    }

    @Serializable
    class StringId(var username: String) : ChatId() {
        init {
            username = if (username.startsWith("@")) username else "@$username"
        }

        override fun chatId(): String = username
    }

    companion object {
        fun fromId(id: Long) = NumberId(id)
        fun fromString(username: String) = StringId(username)
    }
}