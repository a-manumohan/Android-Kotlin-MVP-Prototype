package `in`.co.mn.mvpkotlinproto.main

import `in`.co.mn.mvpkotlinproto.MvpKotlinProtoApplication
import `in`.co.mn.mvpkotlinproto.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainMvp.View {

    @Inject
    lateinit var presenter: MainMvp.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
                .appComponent((application as MvpKotlinProtoApplication).appComponent)
                .mainModule(MainModule(this))
                .build()
                .inject(this)

        presenter.action()
    }

    override fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
