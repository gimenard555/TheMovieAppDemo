package com.jimenard.themovieapp.data.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int = -1,
    @SerializedName("adult")
    val adult: Boolean = false,
    @SerializedName("genre")
    val genre: List<Int> = listOf(),
    @SerializedName("backdrop_path")
    val backdrop_path: String = "",
    @SerializedName("original_title")
    val original_title: String = "",
    @SerializedName("original_language")
    val original_language: String = "",
    @SerializedName("overview")
    val overview: String = "",
    @SerializedName("popularity")
    val popularity: Double = -1.0,
    @SerializedName("poster_path")
    val poster_path: String = "",
    @SerializedName("release_date")
    val release_date: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("video")
    val video: Boolean = false,
)

data class MovieList(
    @SerializedName("results")
    val results: List<Movie> = listOf()
)