package com.eightball.botle.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClass {
    val postService = Retrofit.Builder()
        .baseUrl("appbotle-backend.co")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(DiaryService::class.java)
}
