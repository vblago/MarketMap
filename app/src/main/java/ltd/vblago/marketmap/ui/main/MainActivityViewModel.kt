package ltd.vblago.marketmap.ui.main

import io.reactivex.Single
import ltd.vblago.marketmap.repository.Repository
import ltd.vblago.marketmap.api.model.IpAddress
import ltd.vblago.marketmap.util.SchedulerProvider

class MainActivityViewModel(private val repository: Repository, private val schedulerProvider: SchedulerProvider) {

    fun showDataFromApi(): Single<IpAddress> = repository.getDataFromApi()
            .compose(schedulerProvider.getSchedulersForSingle())
}