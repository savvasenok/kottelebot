package entity.shipping

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShippingAddress(
    @SerialName("country_code") val countryCode: String,
    val state: String,
    val city: String,
    @SerialName("street_line_1") val streetLine1: String,
    @SerialName("street_line_2") val streetLine2: String,
    @SerialName("post_code") val postCode: String
)
