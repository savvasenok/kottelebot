package entity.voice

data class Voice(
    val fileId: String,
    val fileUniqueId: String,
    val duration: Int,
    val mimeType: String?,
    val fileSize: Int?
)
