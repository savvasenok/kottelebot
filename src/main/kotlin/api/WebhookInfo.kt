package api

data class WebhookInfo(
    val url: String,
    val hasCustomCertificate: Boolean,
    val pendingUpdateCount: Int,
    val ipAddress: String?,
    val lastErrorDate: Int,
    val lastErrorMessage: String,
    val maxConnections: Int,
    val allowedUpdates: ArrayList<String>?
)
