package ltd.vblago.marketmap.ui.main.di

import dagger.Module
import dagger.Provides
import ltd.vblago.marketmap.api.ApiService
import ltd.vblago.marketmap.ui.main.MainActivity
import ltd.vblago.marketmap.ui.main.MainView


@Module
class MainActivityModule {

    @Provides
    internal fun provideMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

//    @Provides
//    internal fun provideMainPresenter(mainView: MainView, apiService: ApiService): MainPresenter {
//        return MainPresenterImpl(mainView, apiService)
//    }
}