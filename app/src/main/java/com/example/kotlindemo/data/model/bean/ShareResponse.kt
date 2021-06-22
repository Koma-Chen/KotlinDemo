package  com.example.kotlindemo.data.model.bean

import android.annotation.SuppressLint
import android.os.Parcelable
import com.example.kotlindemo.data.model.bean.ApiPagerResponse
import com.example.kotlindemo.data.model.bean.AriticleResponse
import com.example.kotlindemo.data.model.bean.CoinInfoResponse
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class ShareResponse(
    var coinInfo: CoinInfoResponse,
    var shareArticles: ApiPagerResponse<ArrayList<AriticleResponse>>
) : Parcelable