package entity.reply.keyboard

data class ReplyKeyboardRemove(
    val removeKeyboard: Boolean = true,
    val selective: Boolean?
)
