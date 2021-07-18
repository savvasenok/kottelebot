package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.FoursquareType
import types.GooglePlaceType

@Serializable
data class Venue(
    val location: Location,
    val title: String,
    val address: String,
    @SerialName("foursquare_id") val foursquareId: String? = null,
    @SerialName("foursquare_type") val foursquareType: FoursquareType? = null, // TODO: find all types
    @SerialName("google_place_id") val googlePlaceId: String? = null,
    @SerialName("google_place_type") val googlePlaceType: GooglePlaceType? = null
)
