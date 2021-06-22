package com.jimenard.themovieapp.di

import com.jimenard.themovieapp.BuildConfig
import com.jimenard.themovieapp.data.api.TheMovieHelperImpl
import com.jimenard.themovieapp.data.repository.TheMovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun getTheMoviesApiUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    } else OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, baseUrl: String) =
        Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create()).baseUrl(baseUrl)
            .client(okHttpClient).build()

    @Provides
    @Singleton
    fun provideTheMovieService(retrofit: Retrofit) = retrofit.create(TheMovieService::class.java)

    @Provides
    @Singleton
    fun provideTheMoviesImpl(movieHelper: TheMovieHelperImpl) = movieHelper
}