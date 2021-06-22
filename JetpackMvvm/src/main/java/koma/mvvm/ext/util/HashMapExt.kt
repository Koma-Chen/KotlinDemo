package koma.mvvm.ext.util

import com.hjq.gson.factory.GsonFactory
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

fun HashMap<String, Any>?.toJsonRequestBody(): RequestBody {
    return GsonFactory.getSingletonGson().toJson(this)
        .toRequestBody("application/json;charset=UTF-8".toMediaTypeOrNull())
}