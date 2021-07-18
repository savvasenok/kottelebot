package entity

import entity.media.PhotoSize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserProfilePhotos(
    @SerialName("total_count") val totalCount: Int,
    val photos: ArrayList<ArrayList<PhotoSize>>
)
