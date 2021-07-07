package entity

data class Audio(
    val fileId: String,
    val fileUniqueId: String,
    val duration: Int,
    val performer: String?,
    val title: String?,
    val fileName: String?,
    val mimeType: String?,
    val fileSize: Int,
    val thumb: PhotoSize?
)
