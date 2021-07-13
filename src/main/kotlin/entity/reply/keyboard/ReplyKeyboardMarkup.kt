package entity.reply.keyboard

data class ReplyKeyboardMarkup(
    val keyboard: ArrayList<ArrayList<ReplyKeyboardButton>>,
    val resizeKeyboard: Boolean? = false,
    val oneTimeKeyboard: Boolean? = false,
    val inputFieldPlaceholder: String?,
    val selective: Boolean
)
