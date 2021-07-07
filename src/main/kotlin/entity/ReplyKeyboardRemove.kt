package entity

data class ReplyKeyboardRemove(
    val removeKeyboard: Boolean = true,
    val selective: Boolean?
)
