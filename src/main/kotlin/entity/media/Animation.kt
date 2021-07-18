package entity.media

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Animation(
    val fileId: String,
    @SerialName("file_unique_id")val fileUniqueId: String,
    val width: Int,
    val height: Int,
    val duration: Int,
    val thumb: PhotoSize? = null,
    @SerialName("file_name")val fileName: String? = null,
    @SerialName("mime_type")val mimeType: String? = null,
    @SerialName("file_size")val fileSize: Int? = null
)
