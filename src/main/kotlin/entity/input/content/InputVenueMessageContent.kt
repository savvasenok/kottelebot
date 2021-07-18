package entity.input.content

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.FoursquareType
import types.GooglePlaceType

@Serializable
data class InputVenueMessageContent(
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val address: String,
    @SerialName("foursquare_id") val foursquareId: String,
    @SerialName("foursquare_type") val foursquareType: FoursquareType,
    @SerialName("google_place_id") val googlePlaceId: String,
    @SerialName("google_place_type") val googlePlaceType: GooglePlaceType
) : InputMessageContent()
