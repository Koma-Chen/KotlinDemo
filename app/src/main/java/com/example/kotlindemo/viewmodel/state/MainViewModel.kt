package com.example.kotlindemo.viewmodel.state

import com.blankj.utilcode.util.ToastUtils
import com.example.kotlindemo.app.network.apiService
import koma.mvvm.base.viewmodel.BaseViewModel
import koma.mvvm.callback.databind.StringObservableField
import koma.mvvm.ext.requestNoCheck
import koma.mvvm.ext.util.toJsonRequestBody

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