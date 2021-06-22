package com.jimenard.themovieapp.data.api

import com.jimenard.themovieapp.data.model.Movie
import com.jimenard.themovieapp.data.model.MovieList
import com.jimenard.themovieapp.data.repository.TheMovieService
import com.jimenard.themovieapp.utils.AppConstants
import retrofit2.Response
import javax.inject.Inject

class TheMovieHelperImpl @Inject constructor(private val apiService: TheMovieService) {

    suspend fun getMovies(): Response<List<Movie>> = this.apiService.getMovies()

    suspend fun getUpcomingMovies() = this.apiService.getUpcomingMovies(AppConstants.API_KEY)

    suspend fun getTopRatedMovies() = this.apiService.getTopRatedMovies(AppConstants.API_KEY)

    suspend fun getPopularMovies() = this.apiService.getPopularMovies(AppConstants.API_KEY)


}