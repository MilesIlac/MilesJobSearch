package com.milesilac.milesjobsearch.model

data class Job(
    val contents: String = "", //parseToHtml
    val name: String = "",
    val type: String = "",
    val publicationDate: String = "", //parseToTimeFormat
    val shortName: String = "",
    val id: Long = 0L
) {





//    "id": 10958000,
//    "locations": [
//    {
//        "name": "Flexible / Remote"
//    },
//    {
//        "name": "Morristown, NJ"
//    },
//    {
//        "name": "New Brunswick, NJ"
//    },
//    {
//        "name": "Newark, NJ"
//    },
//    {
//        "name": "Princeton, NJ"
//    }
//    ],
//    "categories": [
//    {
//        "name": "Software Engineering"
//    }
//    ],
//    "levels": [
//    {
//        "name": "Mid Level",
//        "short_name": "mid"
//    }
//    ],
//    "tags": [],
//    "refs": {
//        "landing_page": "https://www.themuse.com/jobs/philips/biomedical-equipment-technical-consultant-patient-monitoring"
//    },
//    "company": {
//        "id": 1103,
//        "short_name": "philips",
//        "name": "Philips"
//    }
}