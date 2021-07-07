package entity

data class VideoNote(
    val fileId: String,
    val fileUniqueId: String,
    val length: Int,
    val duration: Int,
    val thumb: PhotoSize?,
    val fileSize: Int?
)
