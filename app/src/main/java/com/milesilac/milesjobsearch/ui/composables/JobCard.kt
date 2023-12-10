package com.milesilac.milesjobsearch.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.milesilac.milesjobsearch.ui.theme.MilesJobSearchTheme

@Composable
fun JobCard(
    modifier: Modifier = Modifier,
    publicationDate: String,
    companyName: String,
    jobName: String,
    levels: String,
    isRemotePossible: Boolean = true,
    locations: String = "Flexible/Remote",
    categories: String,
) {
    Row (modifier = Modifier.padding(4.dp)) {
        Column {
            Text(
                text = "Posted: $publicationDate",
                fontSize = 14.sp
            )
            Text(
                text = companyName,
                fontSize = 24.sp
            )
            Text(
                text = jobName,
                fontSize = 20.sp
            )
            Text(
                text = "Job Level/s: $levels",
                fontSize = 16.sp
            )
            Text(
                text = "Work Location/s: $locations",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.size(12.dp))
            Text(
                text = "Posted under: $categories",
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JobCardPreview() {
    MilesJobSearchTheme {
        JobCard(
            publicationDate = "January 1, 2025",
            companyName = "Software Company",
            jobName = "Mobile Application (Native) Developer",
            levels = "Entry, Mid, Senior",
            categories = "Computer and IT, Software Engineering",
        )
    }
}