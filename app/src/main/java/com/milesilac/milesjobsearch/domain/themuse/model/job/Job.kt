package com.milesilac.milesjobsearch.domain.themuse.model.job

data class Job(
    val contents: String = "", //parseToHtml
    val name: String = "",
    val type: String = "",
    val publicationDate: String = "", //parseToTimeFormat
    val shortName: String = "",
    val id: Int = 0,
    val locations: List<Location> = emptyList(),
    val categories: List<JobCategory> = emptyList(),
    val levels: List<JobLevel> = emptyList(),
    val refs: Refs? = null,
    val company: CompanyData? = null
)