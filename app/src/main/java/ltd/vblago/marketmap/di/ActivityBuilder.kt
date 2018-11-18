package ltd.vblago.marketmap.di

import dagger.Module
import ltd.vblago.marketmap.ui.main.MainActivity
import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds
import ltd.vblago.marketmap.ui.main.di.MainActivityComponent


@Module
abstract class ActivityBuilder {

    @Module
    abstract inner class ActivityBuilder {

        @Binds
        @IntoMap
        @ActivityKey(MainActivity::class)
        internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>



    }
}