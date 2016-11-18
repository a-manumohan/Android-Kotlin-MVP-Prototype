package `in`.co.mn.mvpkotlinproto.main

interface MainMvp {
    interface View {
        fun toast(message: String)
    }

    interface Presenter {
        fun action()
    }
}