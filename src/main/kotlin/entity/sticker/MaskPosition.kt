package entity.sticker

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.FacePart

@Serializable
data class MaskPosition(
    val point: FacePart,
    @SerialName("x_shift") val xShift: Float,
    @SerialName("y_shift") val yShift: Float,
    val scale: Float
)
