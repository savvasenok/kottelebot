package error

import error.PassportElementError
import types.PassportElementTranslationFileType

data class PassportElementErrorTranslationFile(
    val type: PassportElementTranslationFileType,
    val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "translation_file"
}
