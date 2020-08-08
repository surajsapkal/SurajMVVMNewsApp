package com.androiddevs.mvvmnewsapp.ui.api

import com.androiddevs.mvvmnewsapp.uAPI_KEYi.util.Constants.Companion.API_KEY
import com.androiddevs.mvvmnewsapp.ui.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "in",
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
        ):Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searcForhNews(
        @Query("q")
        searchQqery: String,
        @Query("page")
        pageNumber:Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ):Response<NewsResponse>
}