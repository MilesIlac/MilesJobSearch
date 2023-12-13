package com.milesilac.milesjobsearch.data.remote.themuse

import com.milesilac.milesjobsearch.data.remote.themuse.dto.joblist.JobListDto
import retrofit2.Response
import retrofit2.http.GET

interface TheMuseApiService {

    @GET("/jobs")
    suspend fun getJobsList(): Response<JobListDto>
}