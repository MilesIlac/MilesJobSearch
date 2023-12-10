package com.milesilac.milesjobsearch.domain.model

import com.google.gson.annotations.SerializedName

data class Refs(
    @SerializedName("landing_page") val landingPage: String = "" //is a url
)
