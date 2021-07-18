package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementFileType

@Serializable
data class PassportElementErrorFile(
    val type: PassportElementFileType,
    @SerialName("file_hansh") val fileHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "file"
}