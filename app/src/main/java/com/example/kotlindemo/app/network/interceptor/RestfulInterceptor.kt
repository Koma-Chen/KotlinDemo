package com.example.kotlindemo.app.network.interceptor

import com.blankj.utilcode.util.ToastUtils
import com.example.kotlindemo.data.model.bean.RestfulErrorResponse
import com.hjq.gson.factory.GsonFactory
import me.hgj.jetpackmvvm.network.RestfulException
import me.hgj.jetpackmvvm.util.LogUtils
import okhttp3.Interceptor
import okhttp3.Response

class RestfulInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        val response = chain.proceed(builder.build())
        if (response.code != 200) {
            val temp = GsonFactory.getSingletonGson()
                .fromJson(response.body?.string(), RestfulErrorResponse::class.java)
            ToastUtils.showShort(temp.errorMessage)
            throw  RestfulException(temp.errorCode, temp.error, temp.errorMessage)
        }
        return response
    }
}