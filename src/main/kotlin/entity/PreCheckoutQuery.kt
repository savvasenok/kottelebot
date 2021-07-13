package entity

data class PreCheckoutQuery(
    val id: String,
    val from: User,
    val currency: String,
    val totalAmount: Int,
    val invoicePayload: String,
    val shippingOptionId: String,
    val orderInfo: OrderInfo
)
