package entity

import entity.shipping.ShippingAddress

data class OrderInfo(
    val name: String?,
    val phoneNumber: String?,
    val email: String?,
    val shippingAddress: ShippingAddress?
)
