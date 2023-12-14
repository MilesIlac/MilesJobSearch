package com.milesilac.milesjobsearch.ui.feature

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.milesilac.milesjobsearch.ui.composables.JobListLayout
import com.milesilac.milesjobsearch.domain.themuse.model.job.CompanyData
import com.milesilac.milesjobsearch.domain.themuse.model.job.Job
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobCategory
import com.milesilac.milesjobsearch.domain.themuse.model.job.JobLevel
import com.milesilac.milesjobsearch.ui.theme.MilesJobSearchTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleScope.launch {
            viewModel.mainState.collect { state ->
                when (state) {
                    is MainState.GetJobsList -> {
                        setContent {
                            MilesJobSearchTheme {
                                // A surface container using the 'background' color from the theme
                                Surface(
                                    modifier = Modifier.fillMaxSize(),
                                    color = MaterialTheme.colorScheme.background
                                ) {
                                    JobListLayout(jobs = state.jobList.jobList)
                                }
                            }
                        }
                    }
                }
            }
        }
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
        viewModel.getJobsList()
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