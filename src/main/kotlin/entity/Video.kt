package entity

data class Video(
    val fileId: String,
    val fileUniqueId: String,
    val width: Int,
    val height: Int,
    val duration: Int,
    val thumb: PhotoSize?,
    val fileName: String?,
    val mimeType: String?,
    val fileSize: Int?
)
