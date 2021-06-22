package com.jimenard.themovieapp.data.repository

import com.google.gson.GsonBuilder
import com.jimenard.themovieapp.data.model.Movie
import com.jimenard.themovieapp.data.model.MovieList
import com.jimenard.themovieapp.utils.AppConstants
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieService {

     @GET("") //todo aqui va las contantes
     suspend fun getMovies(): Response<List<Movie>>


    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey: String
    ): MovieList

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("api_key") apiKey: String
    ): MovieList

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key") apiKey: String
    ): MovieList


}

object RetrofitClient {

    val webService by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(TheMovieService::class.java)
    }


}