package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName

data class CategoryDto(
    @SerializedName("name")
    val name: String
)