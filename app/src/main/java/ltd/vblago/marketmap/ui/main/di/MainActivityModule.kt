package ltd.vblago.marketmap.ui.main.di

import dagger.Module
import dagger.Provides
import ltd.vblago.marketmap.repository.Repository
import ltd.vblago.marketmap.ui.main.MainActivityViewModel
import ltd.vblago.marketmap.util.SchedulerProvider

@Module
class MainActivityModule {

    @Provides
    fun provideViewModel(repository: Repository, schedulerProvider: SchedulerProvider) = MainActivityViewModel(repository, schedulerProvider)
}