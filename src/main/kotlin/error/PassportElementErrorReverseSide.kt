package error

import types.PassportElementReverseSideType

data class PassportElementErrorReverseSide(
    val type: PassportElementReverseSideType,
    val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "reverse_side"
}