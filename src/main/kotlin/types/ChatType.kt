package types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ChatType {
    @SerialName("private")
    PRIVATE,

    @SerialName("group")
    GROUP,

    @SerialName("supergroup")
    SUPERGROUP,

    @SerialName("channel")
    CHANNEL,

    @SerialName("other")
    OTHER
}