package `in`.co.mn.mvpkotlinproto.main

import `in`.co.mn.mvpkotlinproto.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class MainModule(var view: MainMvp.View) {

    @Provides
    @ActivityScope
    fun providePresenter(): MainMvp.Presenter {
        return MainPresenter(view)
    }
}