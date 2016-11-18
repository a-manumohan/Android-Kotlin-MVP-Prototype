package `in`.co.mn.mvpkotlinproto.main

import `in`.co.mn.mvpkotlinproto.ActivityScope
import `in`.co.mn.mvpkotlinproto.AppComponent
import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}