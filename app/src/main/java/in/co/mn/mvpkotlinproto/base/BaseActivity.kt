package `in`.co.mn.mvpkotlinproto.base

import `in`.co.mn.mvpkotlinproto.AppComponent
import `in`.co.mn.mvpkotlinproto.MvpKotlinProtoApplication
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup

abstract class BaseActivity : AppCompatActivity() {

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        inject((application as MvpKotlinProtoApplication).appComponent)
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        super.setContentView(view, params)
        inject((application as MvpKotlinProtoApplication).appComponent)
    }

    abstract fun inject(appComponent: AppComponent);
}
