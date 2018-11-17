package ltd.vblago.marketmap.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ltd.vblago.marketmap.ui.main.MainActivity
import ltd.vblago.marketmap.ui.main.di.MainActivityModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity(): MainActivity
}