package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementReverseSideType

@Serializable
data class PassportElementErrorReverseSide(
    val type: PassportElementReverseSideType,
    @SerialName("file_hash") val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "reverse_side"
}