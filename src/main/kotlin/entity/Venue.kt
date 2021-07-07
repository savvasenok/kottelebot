package entity

import types.FoursquareType
import types.GooglePlaceType

data class Venue(
    val location: Location,
    val title: String,
    val address: String,
    val foursquareId: String?,
    val foursquareType: FoursquareType?, // TODO: find all types
    val googlePlaceId: String?,
    val googlePlaceType: GooglePlaceType?
)
