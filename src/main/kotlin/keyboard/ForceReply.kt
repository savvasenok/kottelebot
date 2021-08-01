package keyboard

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForceReply(
    @SerialName("force_reply") val forceReply: Boolean = true,
    @SerialName("input_field_placeholder") val inputFieldPlaceholder: String,
    val selective: Boolean
) : Keyboard
