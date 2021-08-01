package keyboard

import entity.reply.keyboard.ReplyKeyboardButton
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReplyKeyboardMarkup(
    val keyboard: ArrayList<ArrayList<ReplyKeyboardButton>>,
    @SerialName("resize_keyboard") val resizeKeyboard: Boolean? = null,
    @SerialName("one_time_keyboard") val oneTimeKeyboard: Boolean? = null,
    @SerialName("input_field_placeholder") val inputFieldPlaceholder: String? = null,
    val selective: Boolean
) : Keyboard
