package com.milesilac.milesjobsearch.data.remote.dto.joblist


import com.google.gson.annotations.SerializedName
import com.milesilac.milesjobsearch.data.remote.dto.job.JobDto

data class JobListDto(
    @SerializedName("aggregations")
    val aggregations: Aggregations,
    @SerializedName("items_per_page")
    val itemsPerPage: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("page_count")
    val pageCount: Int,
    @SerializedName("results")
    val results: List<JobDto>,
    @SerializedName("timed_out")
    val timedOut: Boolean,
    @SerializedName("took")
    val took: Int,
    @SerializedName("total")
    val total: Int
)