package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebhookInfo(
    val url: String,
    @SerialName("has_custom_certificate") val hasCustomCertificate: Boolean,
    @SerialName("pending_update_count") val pendingUpdateCount: Int,
    @SerialName("ip_address") val ipAddress: String? = null,
    @SerialName("last_error_date") val lastErrorDate: Int,
    @SerialName("last_error_message") val lastErrorMessage: String,
    @SerialName("max_connections") val maxConnections: Int,
    @SerialName("allowed_updates") val allowedUpdates: ArrayList<String>? = null
)
