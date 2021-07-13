package entity.input.content

import types.FoursquareType
import types.GooglePlaceType

data class InputVenueMessageContent(
    val latitude: Float,
    val longitude: Float,
    val title: String,
    val address: String,
    val foursquareId: String,
    val foursquareType: FoursquareType,
    val googlePlaceId: String,
    val googlePlaceType: GooglePlaceType
) : InputMessageContent()
