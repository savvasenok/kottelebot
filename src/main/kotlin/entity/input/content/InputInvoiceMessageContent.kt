package entity.input.content

import entity.LabeledPrice
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InputInvoiceMessageContent(
    val title: String,
    val description: String,
    val payload: String,
    @SerialName("provider_token") val providerToken: String,
    val currency: String,
    val prices: ArrayList<LabeledPrice>,
    @SerialName("max_tip_amount") val maxTipAmount: Int? = null,
    @SerialName("suggested_tip_amounts") val suggestedTipAmounts: ArrayList<Int>? = null,
    val providerData: String? = null,
    val photoUrl: String? = null,
    val photoSize: Int? = null,
    @SerialName("photo_width") val photoWidth: Int? = null,
    @SerialName("photo_height") val photoHeight: Int? = null,
    @SerialName("need_name") val needName: Boolean? = null,
    @SerialName("need_phone_number") val needPhoneNumber: Boolean? = null,
    @SerialName("need_email") val needEmail: Boolean? = null,
    @SerialName("need_shipping_address") val needShippingAddress: Boolean? = null,
    @SerialName("send_phone_number_to_provider") val sendPhoneNumberToProvider: Boolean? = null,
    @SerialName("send_email_to_provider") val sendEmailToProvider: Boolean? = null,
    @SerialName("is_flexible") val isFlexible: Boolean? = null
) : InputMessageContent()
