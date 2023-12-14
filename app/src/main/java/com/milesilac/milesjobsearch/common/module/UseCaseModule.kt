package com.milesilac.milesjobsearch.common.module

import com.milesilac.milesjobsearch.domain.themuse.TheMuseRepository
import com.milesilac.milesjobsearch.domain.themuse.usecase.GetJobsListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideGetJobsListUseCase(remoteSource: TheMuseRepository): GetJobsListUseCase {
        return GetJobsListUseCase(remoteSource)
    }

}