package keyboard

import entity.inline.keyboard.InlineKeyboardButton
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InlineKeyboardMarkup(
    @SerialName("inline_keyboard") val inlineKeyboard: ArrayList<ArrayList<InlineKeyboardButton>>
) : Keyboard
