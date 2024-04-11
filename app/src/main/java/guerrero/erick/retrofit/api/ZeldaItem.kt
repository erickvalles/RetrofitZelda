package guerrero.erick.retrofit.api

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ZeldaItem(
    val name:String,
    val description:String,
    val category:String,
    val image:String
)
