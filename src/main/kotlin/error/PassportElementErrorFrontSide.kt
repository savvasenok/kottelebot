package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementFrontSideType

@Serializable
data class PassportElementErrorFrontSide(
    val type: PassportElementFrontSideType,
    @SerialName("file_hash") val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "front_side"
}
