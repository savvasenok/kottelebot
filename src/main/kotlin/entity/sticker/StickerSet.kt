package entity.sticker

import entity.media.PhotoSize

data class StickerSet(
    val name: String,
    val title: String,
    val isAnimated: Boolean,
    val containsMasks: Boolean,
    val stickers: ArrayList<Sticker>,
    val thumb: PhotoSize?
)
