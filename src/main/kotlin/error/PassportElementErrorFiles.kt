package error

import types.PassportElementFileType

data class PassportElementErrorFiles(
    val type: PassportElementFileType,
    val fileHashes: ArrayList<String>,
    val message: String
) : PassportElementError() {
    val source: String = "files"
}
