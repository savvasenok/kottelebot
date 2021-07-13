package error

import types.PassportElementFileType

data class PassportElementErrorFile(
    val type: PassportElementFileType,
    val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "file"
}