package com.eightball.botle.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface DiaryService {
    @POST("/diary/write")
    fun submitDiray() : Call<>

    @POST("/diary/modify")
    fun modifyDiary() : Call<>

    @GET("/diary/search/{sort}/{category}")
    fun checkOneDiary() : Call<>

    @GET("/diarys/search/{sort}/{category}")
    fun checkDiarys() : Call<>
}