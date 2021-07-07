package entity

data class Sticker(
    val fileId: String,
    val fileUniqueId: String,
    val width: Int,
    val height: Int,
    val isAnimated: Boolean,
    val thumb: PhotoSize?,
    val emoji: String?,
    val setName: String?,
    val maskPosition: MaskPosition?,
    val fileSize: Int
)
