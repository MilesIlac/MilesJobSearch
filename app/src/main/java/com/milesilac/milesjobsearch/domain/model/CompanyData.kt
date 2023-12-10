package com.milesilac.milesjobsearch.domain.model

import com.google.gson.annotations.SerializedName

data class CompanyData(
    val id: Int = 0,
    val name: String = "",
    @SerializedName("short_name") val shortName: String = ""
)
