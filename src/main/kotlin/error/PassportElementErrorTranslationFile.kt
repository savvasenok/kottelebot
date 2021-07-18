package error

import error.PassportElementError
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementTranslationFileType

@Serializable
data class PassportElementErrorTranslationFile(
    val type: PassportElementTranslationFileType,
    @SerialName("file_hash") val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "translation_file"
}
