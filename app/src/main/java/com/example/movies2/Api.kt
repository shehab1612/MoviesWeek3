package com.example.movies2


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "63117e5bbff4d79ec138eb07dec22049",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}