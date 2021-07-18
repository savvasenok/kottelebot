package entity.sticker

import entity.media.PhotoSize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StickerSet(
    val name: String,
    val title: String,
    @SerialName("is_animated") val isAnimated: Boolean,
    @SerialName("contains_masks") val containsMasks: Boolean,
    val stickers: ArrayList<Sticker>,
    val thumb: PhotoSize? = null
)
