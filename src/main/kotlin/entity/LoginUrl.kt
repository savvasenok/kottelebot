package entity

data class LoginUrl(
    val url: String,
    val forwardText: String?,
    val botUsername: String?,
    val requestWriteAccess: Boolean?
)
