package com.example.kotlindemo.viewmodel.request

import androidx.lifecycle.MutableLiveData
import com.example.kotlindemo.app.network.stateCallback.ListDataUiState
import com.example.kotlindemo.app.network.stateCallback.UpdateUiState
import com.example.kotlindemo.data.model.bean.AriticleResponse
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.state.ResultState

/**
 * 作者　: hegaojian

 * 描述　: 只做一件事，拿数据源
 */
class RequestAriticleViewModel : BaseViewModel() {

    var pageNo = 0

    var addData = MutableLiveData<ResultState<Any?>>()

    //分享的列表集合数据
    var shareDataState = MutableLiveData<ListDataUiState<AriticleResponse>>()

    //删除分享文章回调数据
    var delDataState = MutableLiveData<UpdateUiState<Int>>()

}