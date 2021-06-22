package koma.mvvm.network

import java.io.IOException

class RestfulException(errCode: Int, error: String?, errorLog: String? = "") : IOException(error) {

    var error: String = "" //错误消息
    var errorCode: Int = errCode //错误码
    var errorMessage: String = "" //错误日志

    init {
        this.error = error ?: "请求失败，请稍后再试"
        this.errorMessage = errorLog ?: this.errorMessage
    }

}