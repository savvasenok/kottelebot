package error

import types.PassportElementTranslationFileType

data class PassportElementErrorTranslationFiles(
    val type: PassportElementTranslationFileType,
    val fileHashes: ArrayList<String>,
    val message: String
) : PassportElementError() {
    val source: String = "translation_files"
}
