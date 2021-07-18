package entity

import entity.shipping.ShippingAddress
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OrderInfo(
    val name: String? = null,
    @SerialName("phone_number") val phoneNumber: String? = null,
    val email: String? = null,
    @SerialName("shipping_address") val shippingAddress: ShippingAddress? = null
)
