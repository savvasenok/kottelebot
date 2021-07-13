package entity.input.content

import entity.LabeledPrice

data class InputInvoiceMessageContent(
    val title: String,
     val description: String,
    val payload: String,
    val providerToken: String,
    val currency: String,
    val prices: ArrayList<LabeledPrice>,
    val maxTipAmount: Int?,
    val suggestedTipAmounts: ArrayList<Int>?,
    val providerData: String?,
    val photoUrl: String?,
    val photoSize: Int?,
    val photoWidth: Int?,
    val photoHeight: Int?,
    val needName: Boolean?,
    val needPhoneNumber: Boolean?,
    val needEmail: Boolean?,
    val needShippingAddress: Boolean?,
    val sendPhoneNumberToProvider: Boolean?,
    val sendEmailToProvider: Boolean?,
    val isFlexible: Boolean?
) : InputMessageContent()
