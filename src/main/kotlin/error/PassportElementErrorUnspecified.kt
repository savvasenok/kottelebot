package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementUnspecifiedType

@Serializable
data class PassportElementErrorUnspecified(
    val type: PassportElementUnspecifiedType,
    @SerialName("element_hash") val elementHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "unspecified"
}
