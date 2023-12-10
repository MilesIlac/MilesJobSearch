package com.milesilac.milesjobsearch.data.remote.dto.job


import com.google.gson.annotations.SerializedName
import com.milesilac.milesjobsearch.domain.model.CompanyData
import com.milesilac.milesjobsearch.domain.model.Job
import com.milesilac.milesjobsearch.domain.model.JobCategory
import com.milesilac.milesjobsearch.domain.model.JobLevel
import com.milesilac.milesjobsearch.domain.model.Location
import com.milesilac.milesjobsearch.domain.model.Refs

data class JobDto(
    @SerializedName("categories")
    val categories: List<CategoryDto>,
    @SerializedName("company")
    val company: CompanyDto,
    @SerializedName("contents")
    val contents: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("levels")
    val levels: List<LevelDto>,
    @SerializedName("locations")
    val locations: List<LocationDto>,
    @SerializedName("model_type")
    val modelType: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("publication_date")
    val publicationDate: String,
    @SerializedName("refs")
    val refs: RefsDto,
    @SerializedName("short_name")
    val shortName: String,
    @SerializedName("tags")
    val tags: List<Any>,
    @SerializedName("type")
    val type: String
) {
    fun JobDto.toJob() : Job {
        return Job(
        contents = contents,
        name = name,
        type = type,
        publicationDate = publicationDate,
        shortName = shortName,
        id = id,
        locations = locations.map { Location(name = it.name) },
        categories = categories.map { JobCategory(name = it.name) },
        levels = levels.map { JobLevel(name = it.name, shortName = it.shortName) },
        refs = Refs(landingPage = refs.landingPage),
        company = company.let { CompanyData(id = it.id, name = it.name, shortName = it.shortName) }
        )
    }
}