package com.jimenard.themovieapp.ui.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.jimenard.themovieapp.R
import com.jimenard.themovieapp.data.api.TheMovieHelperImpl
import com.jimenard.themovieapp.data.repository.RetrofitClient
import com.jimenard.themovieapp.data.repository.TheMoviesRepository
import com.jimenard.themovieapp.databinding.FragmentMoviesBinding
import com.jimenard.themovieapp.presentation.MoviesViewModel


class MoviesFragment : Fragment(R.layout.fragment_movies) {

    //private lateinit var concatAdapter: ConcatAdapter
    private lateinit var binding: FragmentMoviesBinding

    private val viewModel by viewModels<MoviesViewModel> {
        MoviesViewModel.MovieViewModelFactory(
            TheMoviesRepository(

            )
        )
    }

    override fun onViewCreated(view: View,saveInstanceState: Bundle?) {
        super.onViewCreated(view, saveInstanceState)
        binding = FragmentMoviesBinding.bind(view)

    }

}