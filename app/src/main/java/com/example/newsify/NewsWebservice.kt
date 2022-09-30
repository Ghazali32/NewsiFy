package com.example.newsify

import com.example.newsify.Constants.Companion.API_KEY
import com.example.newsify.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


class NewsWebservice {
    private lateinit var api : NewsApi


    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

      api= retrofit.create(NewsApi::class.java)

    }
    suspend fun getNews() : NewsCategory
    {
        return api.getNews()
    }
 interface NewsApi{
     @GET("v2/top-headlines")
   suspend fun getNews(
        @Query("country")
        countryCode : String = "in",
        @Query("apiKey")
        apiKey : String = API_KEY
    ) : NewsCategory
 }
}