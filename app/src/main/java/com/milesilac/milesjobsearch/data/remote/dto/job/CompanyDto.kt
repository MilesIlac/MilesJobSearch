package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName

data class CompanyDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("short_name")
    val shortName: String
)