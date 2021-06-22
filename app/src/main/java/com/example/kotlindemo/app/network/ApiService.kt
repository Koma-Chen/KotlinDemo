package  com.example.kotlindemo.app.network

import com.example.kotlindemo.data.model.bean.*
import okhttp3.RequestBody
import retrofit2.http.*

/**
 * 作者　: Koma
 * 　: 2019/12/23
 * 描述　: 网络API
 */
interface ApiService {

    companion object {
        const val SERVER_URL = "https://www.calfkaka.com/api/parents/v1/"
    }

    /**
     * 登录
     */
    @POST("login")
    suspend fun login(
        @Query("type") type: String,
        @Body body: RequestBody
    ): ApiResponse<LoginBean>
}