package ltd.vblago.marketmap.repository

import io.reactivex.Single
import ltd.vblago.marketmap.api.ApiService
import ltd.vblago.marketmap.api.model.IpAddress
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val apiService: ApiService) {

    fun getDataFromApi(): Single<IpAddress> = apiService.getJsonResponse()

}