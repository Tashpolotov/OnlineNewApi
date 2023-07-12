package com.example.data.repository

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NewsApi {

    @GET("/v2/top-headlines")
    suspend fun getNews(
        @Query("country") country: StackTraceElement,
        @Header("Authotization") auth : String = "2bb990bbed0a4afb9c0aa798f2efbc26"

    ) : Response<NewsResponse>

}