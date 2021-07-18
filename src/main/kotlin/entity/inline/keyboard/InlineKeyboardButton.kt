package entity.inline.keyboard

import entity.game.CallbackGame
import entity.LoginUrl
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InlineKeyboardButton(
    val text: String,
    val url: String? = null,
    @SerialName("login_url") val loginUrl: LoginUrl? = null,
    @SerialName("callback_data") val callbackData: String? = null,
    @SerialName("switch_inline_query") val switchInlineQuery: String? = null,
    @SerialName("switch_inline_query_current_chat") val switchInlineQueryCurrentChat: String? = null,
    @SerialName("callback_game") val callbackGame: CallbackGame? = null,
    val pay: Boolean? = null
)
