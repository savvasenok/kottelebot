package entity.reply.keyboard

data class ReplyKeyboardButton(
    val text: String,
    val requestContact: Boolean?,
    val requestLocation: Boolean?,
    val requestPoll: ReplyKeyboardButtonPollType?
)
