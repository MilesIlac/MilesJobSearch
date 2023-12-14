package com.milesilac.milesjobsearch.domain.themuse.usecase

import com.milesilac.milesjobsearch.domain.themuse.TheMuseRepository
import javax.inject.Inject

class GetJobsListUseCase @Inject constructor(
    private val remoteSource: TheMuseRepository
) {

    suspend fun getJobList() = remoteSource.getJobsList()

    suspend fun getTest() = remoteSource.getTest()
}