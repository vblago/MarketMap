package ltd.vblago.marketmap.ui.main.di

import ltd.vblago.marketmap.ui.main.MainActivity
import dagger.android.AndroidInjector
import dagger.Subcomponent


@Subcomponent(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}