package  com.example.kotlindemo.app.weight.loadCallBack

import android.content.Context
import android.view.View
import com.kingja.loadsir.callback.Callback
import  com.example.kotlindemo.R


class LoadingCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_loading
    }

    override fun onReloadEvent(context: Context?, view: View?): Boolean {
        return true
    }
}