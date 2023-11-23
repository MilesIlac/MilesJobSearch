package com.milesilac.milesjobsearch.model

import com.google.gson.annotations.SerializedName

data class CompanyData(
    val id: Int = 0,
    val name: String = "",
    @SerializedName("short_name") val shortName: String = ""
)
