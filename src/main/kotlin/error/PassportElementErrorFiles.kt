package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementFileType

@Serializable
data class PassportElementErrorFiles(
    val type: PassportElementFileType,
    @SerialName("file_hashes") val fileHashes: ArrayList<String>,
    val message: String
) : PassportElementError() {
    val source: String = "files"
}
