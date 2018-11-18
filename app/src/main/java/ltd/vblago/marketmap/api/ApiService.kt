package ltd.vblago.marketmap.api

import io.reactivex.Single
import ltd.vblago.marketmap.api.model.IpAddress
import retrofit2.http.GET

interface ApiService {

    @GET("/")
    fun getJsonResponse(): Single<IpAddress>
}