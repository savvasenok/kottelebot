package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementTranslationFileType

@Serializable
data class PassportElementErrorTranslationFiles(
    val type: PassportElementTranslationFileType,
    @SerialName("file_hashes") val fileHashes: ArrayList<String>,
    val message: String
) : PassportElementError() {
    val source: String = "translation_files"
}
