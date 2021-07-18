package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class File(
    @SerialName("file_id") val fileId: String,
    @SerialName("file_unique_id") val fileUniqueId: String,
    @SerialName("file_size") val fileSize: Int,
    @SerialName("file_path") val filePath: String? = null
) {
    val downloadLink =
        if (filePath == null) null else "PLACEHOLDER/$filePath" // TODO Replace with real link from here https://core.telegram.org/bots/api#file
}
