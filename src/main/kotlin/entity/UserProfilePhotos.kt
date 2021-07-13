package entity

import entity.media.PhotoSize

data class UserProfilePhotos(
    val totalCount: Int,
    val photos: ArrayList<ArrayList<PhotoSize>>
)
