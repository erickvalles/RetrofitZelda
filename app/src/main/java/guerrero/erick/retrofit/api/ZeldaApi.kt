package guerrero.erick.retrofit.api

import retrofit2.http.GET

interface ZeldaApi {
    @GET("all")
    suspend fun fetchContents():ZeldaResponse
}