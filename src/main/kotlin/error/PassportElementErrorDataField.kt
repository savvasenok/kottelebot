package error

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import types.PassportElementDataFieldType

@Serializable
data class PassportElementErrorDataField(
    val type: PassportElementDataFieldType,
    @SerialName("field_name") val fieldName: String,
    @SerialName("data_hash") val dataHash: String,
    val message: String
) : PassportElementError() {
    val source: String = "data"
}
