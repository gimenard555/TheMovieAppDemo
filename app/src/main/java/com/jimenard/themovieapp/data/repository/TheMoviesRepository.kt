package com.jimenard.themovieapp.data.repository

import com.jimenard.themovieapp.data.api.TheMovieHelper
import com.jimenard.themovieapp.data.model.MovieList
import javax.inject.Inject

class TheMoviesRepository @Inject constructor(private val apiHelper: TheMovieHelper):TheMovieHelper{

    override suspend fun getMovies() = this.apiHelper.getMovies()

    override suspend fun getUpcomingMovies() = this.apiHelper.getUpcomingMovies()

    override suspend fun getTopRatedMovies() = this.apiHelper.getTopRatedMovies()

    override suspend fun getPopularMovies() = this.apiHelper.getPopularMovies()
}