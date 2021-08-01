package api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(
    val ok: Boolean,
    @SerialName("error_code") val errorCode: Int? = null,
    val description: String? = null,
    val result: T? = null
)