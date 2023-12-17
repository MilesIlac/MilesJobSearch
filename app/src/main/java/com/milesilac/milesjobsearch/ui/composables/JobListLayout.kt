package com.milesilac.milesjobsearch.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.milesilac.milesjobsearch.domain.themuse.model.job.CompanyData
import com.milesilac.milesjobsearch.domain.themuse.model.job.Job
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobCategory
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobLevel
import com.milesilac.milesjobsearch.ui.theme.MilesJobSearchTheme

@Composable
fun JobListLayout(jobs: List<Job>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(jobs) { job ->
            JobCard(
                publicationDate = job.publicationDate,
                companyName = job.company?.name.orEmpty(),
                jobName = job.name,
                levels = job.levels.joinToString {
                    it.name
                },
                categories = job.categories.joinToString {
                    it.name
                }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun JobListLayoutPreview() {
    val jobs = listOf(
        Job(
            publicationDate = "January 1, 2025",
            company = CompanyData(
                name = "Software Company"
            ),
            name = "Mobile Application (Native) Developer",
            levels = listOf(JobLevel(name = "Entry"), JobLevel(name = "Mid"), JobLevel(name = "Senior")),
            categories = listOf(JobCategory(name = "Computer and IT"), JobCategory(name = "Software Engineering"))
        )
    )
    MilesJobSearchTheme {
        JobListLayout(jobs = jobs)
    }
}