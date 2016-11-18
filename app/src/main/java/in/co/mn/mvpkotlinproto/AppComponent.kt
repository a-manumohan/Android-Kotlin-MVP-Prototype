package `in`.co.mn.mvpkotlinproto

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun application(): Application
}
