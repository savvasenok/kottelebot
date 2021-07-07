package entity

data class InlineKeyboardButton(
    val text: String,
    val url: String?,
    val loginUrl: LoginUrl?,
    val callbackData: String?,
    val switchInlineQuery: String?,
    val switchInlineQueryCurrentChat: String?,
    val callbackGame: CallbackGame?,
    val pay: Boolean?
)
