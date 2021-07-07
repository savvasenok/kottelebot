package entity

data class ReplyKeyboardMarkup(
    val keyboard: ArrayList<ArrayList<KeyboardButton>>,
    val resizeKeyboard: Boolean? = false,
    val oneTimeKeyboard: Boolean? = false,
    val inputFieldPlaceholder: String?,
    val selective: Boolean
)
