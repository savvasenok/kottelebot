package entity

data class SuccessfulPayment(
    val currency: String,
    val totalAmount: Int,
    val invoicePayload: String,
    val shippingOptionId: String?,
    val orderInfo: OrderInfo?,
    val telegramPaymentChargeId: String,
    val providerPaymentChargeId: String
)
