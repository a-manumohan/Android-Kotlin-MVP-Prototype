package `in`.co.mn.mvpkotlinproto.main

import `in`.co.mn.mvpkotlinproto.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}