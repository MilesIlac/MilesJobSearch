package com.milesilac.milesjobsearch.data.remote.themuse.mapper

import com.milesilac.milesjobsearch.data.remote.themuse.dto.job.JobDto
import com.milesilac.milesjobsearch.data.remote.themuse.dto.joblist.JobListDto
import com.milesilac.milesjobsearch.domain.themuse.model.JobList
import com.milesilac.milesjobsearch.domain.themuse.model.job.CompanyData
import com.milesilac.milesjobsearch.domain.themuse.model.job.Job
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobCategory
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobLevel
import com.milesilac.milesjobsearch.domain.themuse.model.job.Location
import com.milesilac.milesjobsearch.domain.themuse.model.job.Refs

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

fun JobListDto.toJobList() : JobList {
    return JobList(
        jobList = this.results.map { it.toJob() }
    )
}