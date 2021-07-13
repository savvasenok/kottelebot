package error

import types.PassportElementDataFieldType

data class PassportElementErrorDataField(
    val type: PassportElementDataFieldType,
    val fieldName: String,
    val dataHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "data"
}
