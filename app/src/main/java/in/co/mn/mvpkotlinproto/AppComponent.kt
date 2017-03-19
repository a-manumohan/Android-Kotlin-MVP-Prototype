package `in`.co.mn.mvpkotlinproto

import `in`.co.mn.mvpkotlinproto.main.MainComponent
import `in`.co.mn.mvpkotlinproto.main.MainModule
import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun application(): Application

    fun mainComponent(module: MainModule) : MainComponent
}
