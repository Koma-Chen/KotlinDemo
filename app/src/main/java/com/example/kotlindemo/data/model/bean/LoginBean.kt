package com.example.kotlindemo.data.model.bean

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginBean(
    val expire: String = "",
    val token: String = ""
) : Parcelable