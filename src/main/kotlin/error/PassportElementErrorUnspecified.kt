package error

import types.PassportElementUnspecifiedType

data class PassportElementErrorUnspecified(
    val type: PassportElementUnspecifiedType,
    val elementHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "unspecified"
}
