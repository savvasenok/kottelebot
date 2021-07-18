package entity.sticker

import entity.media.PhotoSize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sticker(
    @SerialName("file_id") val fileId: String,
    @SerialName("file_unique_id") val fileUniqueId: String,
    val width: Int,
    val height: Int,
    @SerialName("is_animated") val isAnimated: Boolean,
    val thumb: PhotoSize? = null,
    val emoji: String? = null,
    @SerialName("set_name") val setName: String? = null,
    @SerialName("mask_position") val maskPosition: MaskPosition? = null,
    @SerialName("file_size") val fileSize: Int? = null
)
