package com.milesilac.milesjobsearch.ui.feature

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.milesilac.milesjobsearch.ui.composables.JobListLayout
import com.milesilac.milesjobsearch.domain.model.CompanyData
import com.milesilac.milesjobsearch.domain.model.Job
import com.milesilac.milesjobsearch.domain.model.JobCategory
import com.milesilac.milesjobsearch.domain.model.JobLevel
import com.milesilac.milesjobsearch.ui.theme.MilesJobSearchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MilesJobSearchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JobListLayout(jobs = emptyList())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val jobs = listOf(
        Job(
            publicationDate = "January 1, 2025",
            company = CompanyData(
                name = "Software Company"
            ),
            name = "Mobile Application (Native) Developer",
            levels = listOf(JobLevel(name = "Entry"), JobLevel(name = "Mid"), JobLevel(name = "Senior")),
            categories = listOf(JobCategory(name = "Computer and IT"), JobCategory(name = "Software Engineering"))
        ),
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
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            JobListLayout(jobs = jobs)
        }
    }
}