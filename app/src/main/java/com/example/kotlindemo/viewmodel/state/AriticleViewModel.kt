package com.example.kotlindemo.viewmodel.state

import koma.mvvm.base.viewmodel.BaseViewModel
import koma.mvvm.callback.databind.StringObservableField

/**
 * 作者　: hegaojian
 * 　: 2020/3/11
 * 描述　:
 */
class AriticleViewModel : BaseViewModel() {

    //分享文章标题
    var shareTitle = StringObservableField()

    //分享文章网址
    var shareUrl = StringObservableField()

    //分享文章的人
    var shareName = StringObservableField()

}