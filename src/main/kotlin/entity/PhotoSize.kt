package entity

data class PhotoSize(
    val fileId: String,
    val fileUniqueId: String,
    val width: Int,
    val height: Int,
    val fullSize: Int?
)
