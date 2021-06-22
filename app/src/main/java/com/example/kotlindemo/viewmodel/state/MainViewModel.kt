package com.example.kotlindemo.viewmodel.state

import com.blankj.utilcode.util.ToastUtils
import com.example.kotlindemo.app.network.apiService
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.callback.databind.StringObservableField
import me.hgj.jetpackmvvm.ext.requestNoCheck
import me.hgj.jetpackmvvm.ext.util.toJsonRequestBody

class MainViewModel : BaseViewModel() {

    var token = StringObservableField()


    fun login() {
        requestNoCheck({
            val paramsMap = HashMap<String, Any>()
            paramsMap["deviceId"] = "174e763467504dfd8e2bb17e959a5c15"
            paramsMap["deviceType"] = 2
            paramsMap["mobile"] = "13243756407"
            paramsMap["smsCode"] = 666666
            apiService.login(
                "app",
                paramsMap.toJsonRequestBody()
            )
        }, {
            println("登录成功:${it.token}")
            token.set(it.token)
            ToastUtils.showShort(it.token)
        }, {
            token.set(it)
        })
    }
}