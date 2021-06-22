package com.jimenard.themovieapp.ui.moviesdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.jimenard.themovieapp.R
import com.jimenard.themovieapp.databinding.FragmentDetailsMoviesBinding


class DetailsMoviesFragmento : Fragment(R.layout.fragment_details_movies) {

    private lateinit var binding:FragmentDetailsMoviesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailsMoviesBinding.bind(view)

    }

}