package guerrero.erick.retrofit.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ZeldaResponse(
    @Json(name ="data") val elementos:List<ZeldaItem>
)
