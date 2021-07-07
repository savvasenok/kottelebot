package entity

data class KeyboardButton(
    val text: String,
    val requestContact: Boolean?,
    val requestLocation: Boolean?,
    val requestPoll: KeyboardButtonPollType?
)
