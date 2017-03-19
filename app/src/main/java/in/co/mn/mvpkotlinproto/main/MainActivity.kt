package `in`.co.mn.mvpkotlinproto.main

import `in`.co.mn.mvpkotlinproto.AppComponent
import `in`.co.mn.mvpkotlinproto.R
import `in`.co.mn.mvpkotlinproto.base.BaseActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

class MainActivity : BaseActivity(), MainMvp.View {

    @Inject
    lateinit var presenter: MainMvp.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.action()
    }

    override fun inject(appComponent: AppComponent) {
        appComponent.mainComponent(MainModule(this))
                .inject(this)
    }

    override fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
