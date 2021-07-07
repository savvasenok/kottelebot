package entity

data class Document(
    val fileId: String,
    val fileUniqueId: String,
    val thumb: PhotoSize?,
    val fileName: String?,
    val mimeType: String?,
    val fileSize: Int?
)
