package `in`.co.mn.mvpkotlinproto

import android.app.Application

class MvpKotlinProtoApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}

