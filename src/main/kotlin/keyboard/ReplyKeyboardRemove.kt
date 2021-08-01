package keyboard

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReplyKeyboardRemove(
    @SerialName("remove_keyboard") val removeKeyboard: Boolean = true,
    val selective: Boolean? = null
) : Keyboard
