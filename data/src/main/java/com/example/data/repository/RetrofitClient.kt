package com.example.data.repository

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    private val newsApi: NewsApi

    init {
      val okHttpClient = OkHttpClient.Builder()
          .addInterceptor(HttpLoggingInterceptor())
          .build()

            val retrofit = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://www.weatherapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        newsApi = retrofit.create(NewsApi::class.java)

  }
}