package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Invoice(
    val title: String,
    val description: String,
    @SerialName("start_parameter") val startParameter: String,
    val currency: String,
    @SerialName("total_amount") val totalAmount: String
)
