package com.jimenard.themovieapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.jimenard.themovieapp.data.api.TheMovieHelper
import com.jimenard.themovieapp.data.repository.TheMoviesRepository
import com.jimenard.themovieapp.utils.Resource
import kotlinx.coroutines.Dispatchers

class MoviesViewModel(private val repo: TheMovieHelper) : ViewModel() {

    fun fetchMainScreenMovies() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())

        try {
            emit(
                Resource.Success(
                    Triple(
                        repo.getUpcomingMovies(),
                        repo.getTopRatedMovies(),
                        repo.getPopularMovies()
                    )
                )
            )

        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }

    class MovieViewModelFactory(private val repo: TheMoviesRepository) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return modelClass.getConstructor(TheMoviesRepository::class.java).newInstance(repo)
        }
    }
}