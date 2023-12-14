package com.milesilac.milesjobsearch.data.remote.themuse

import com.milesilac.milesjobsearch.data.remote.themuse.dto.joblist.JobListDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMuseApiService {

    @GET("jobs")
    suspend fun getJobsList(
        @Query("page") page: Int,
        @Query("category") category: String?,
        @Query("location") location: String?
    ): Response<JobListDto>
}