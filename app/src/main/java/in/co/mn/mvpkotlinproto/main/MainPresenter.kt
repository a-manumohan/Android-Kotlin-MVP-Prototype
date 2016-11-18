package `in`.co.mn.mvpkotlinproto.main

class MainPresenter(var view: MainMvp.View) : MainMvp.Presenter {
    override fun action() {
        view.toast("This is a test message")
    }
}