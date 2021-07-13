package error

import types.PassportElementFrontSideType

data class PassportElementErrorFrontSide(
    val type: PassportElementFrontSideType,
    val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "front_side"
}
