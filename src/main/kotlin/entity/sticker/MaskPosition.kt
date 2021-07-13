package entity.sticker

import types.FacePart

data class MaskPosition(
    val point: FacePart,
    val xShift: Float,
    val yShift: Float,
    val scale: Float
)
