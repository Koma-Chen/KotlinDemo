package  com.example.kotlindemo.data.repository.request

import com.example.kotlindemo.app.network.apiService
import com.example.kotlindemo.app.util.CacheUtil
import com.example.kotlindemo.data.model.bean.ApiPagerResponse
import com.example.kotlindemo.data.model.bean.ApiResponse
import com.example.kotlindemo.data.model.bean.AriticleResponse
import com.example.kotlindemo.data.model.bean.LoginBean
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

/**
 * 作者　: Koma
 * 　: 2020/5/4
 * 描述　: 处理协程的请求类
 */

val HttpRequestCoroutine: HttpRequestManger by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
    HttpRequestManger()
}

class HttpRequestManger {

}