package entity.shipping

import entity.LabeledPrice

data class ShippingOption(
    val id: String,
    val title: String,
    val prices: ArrayList<LabeledPrice>
)
