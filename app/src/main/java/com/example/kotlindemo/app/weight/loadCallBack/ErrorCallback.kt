package  com.example.kotlindemo.app.weight.loadCallBack

import com.kingja.loadsir.callback.Callback
import  com.example.kotlindemo.R


class ErrorCallback : Callback() {

    override fun onCreateView(): Int {
        return R.layout.layout_error
    }

}