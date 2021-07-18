package entity.shipping

import entity.LabeledPrice
import kotlinx.serialization.Serializable

@Serializable
data class ShippingOption(
    val id: String,
    val title: String,
    val prices: ArrayList<LabeledPrice>
)
