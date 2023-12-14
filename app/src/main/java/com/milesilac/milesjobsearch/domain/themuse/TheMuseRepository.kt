package com.milesilac.milesjobsearch.domain.themuse

import com.milesilac.milesjobsearch.domain.themuse.model.JobListResponse

interface TheMuseRepository {

//    suspend fun getJobsList(): Flow<Resource<JobListResponse>>
    suspend fun getJobsList(): JobListResponse

    suspend fun getTest()
}