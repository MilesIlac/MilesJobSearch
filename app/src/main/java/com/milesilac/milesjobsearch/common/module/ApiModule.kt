package com.milesilac.milesjobsearch.common.module

import com.milesilac.milesjobsearch.common.Constants
import com.milesilac.milesjobsearch.data.remote.service.TheMuseApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideTheMuseApi(): TheMuseApiService {
        return Retrofit.Builder().run {
            baseUrl(Constants.THE_MUSE_API_BASE_URL)
            addConverterFactory(GsonConverterFactory.create())
            build()
        }.create(TheMuseApiService::class.java)
    }
}