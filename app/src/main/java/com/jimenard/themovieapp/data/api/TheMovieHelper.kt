package com.jimenard.themovieapp.data.api

import com.jimenard.themovieapp.data.model.Movie
import com.jimenard.themovieapp.data.model.MovieList
import retrofit2.Response

interface TheMovieHelper {

    suspend fun getMovies(): Response<List<Movie>>
    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList


}