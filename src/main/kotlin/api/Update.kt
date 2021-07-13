package api

import entity.*
import entity.chat.member.ChatMemberUpdated
import entity.inline.query.InlineQuery
import entity.message.Message
import entity.poll.Poll
import entity.poll.PollAnswer
import entity.shipping.ShippingQuery

data class Update(
    val updateId: Double,
    val message: Message?,
    val editedMessage: Message?,
    val channelPost: Message?,
    val editedChannelPost: Message?,
    val inlineQuery: InlineQuery?,
    val chosenInlineResult: ChosenInlineResult?,
    val callbackQuery: CallbackQuery?,
    val shippingQuery: ShippingQuery?,
    val preCheckoutQuery: PreCheckoutQuery?,
    val poll: Poll?,
    val pollAnswer: PollAnswer?,
    val myChatMember: ChatMemberUpdated?,
    val chatMember: ChatMemberUpdated?
)
