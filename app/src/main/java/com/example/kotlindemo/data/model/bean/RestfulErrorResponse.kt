package com.example.kotlindemo.data.model.bean

data class RestfulErrorResponse(
    val error: String = "",
    val errorCode: Int = 0,
    val errorMessage: String = ""
)