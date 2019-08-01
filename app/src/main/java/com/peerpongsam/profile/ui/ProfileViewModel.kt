package com.peerpongsam.profile.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.peerpongsam.profile.R
import com.peerpongsam.profile.model.*

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    val profiles = mutableListOf<Any>(
            Biography(
                    "peerapongsam",
                    "https://avatars0.githubusercontent.com/u/5426486?v=4",
                    "Peerapong",
                    "Samarnpong",
                    "145 Inthamara 33, Din Daeng, Bangkok 10400",
                    "peerapong.sam@gmail.com",
                    "+668-5610-2461",
                    "24/11/1988",
                    "A ordinary developer who has one daughter",
                    "Married",
                    "Thai",
                    "Android Developer"
            ),
            Heading(application.getString(R.string.heading_personal_info), R.drawable.ic_person),
            Heading(application.getString(R.string.heading_work_experience), R.drawable.ic_work),
            Experience(
                    1459443600000,
                    0,
                    "Lead Mobile Application Developer",
                    "Internet Marketing Co.,Ltd",
                    "Bangkok",
                    "Create android app for pantip.com"
            ),
            Experience(
                    1456678800000,
                    1321376400000,
                    "MIS Officer",
                    "Winner Online Co.,Ltd",
                    "Bangkok",
                    "Create website for game etc. Seal Online Plus, Super Dance Online, Xdition Online, Crazy Shooter Online"
            ),
            Heading(application.getString(R.string.heading_education), R.drawable.ic_education),
            Education(
                    "2011",
                    "Ubon Ratchathani University",
                    "Bachelor of Science (Information Technology)"
            ),
            Education(
                    "2007",
                    "Hua Taphan Wittayakhom School",
                    "Senior High School"
            ),
            Education(
                    "2004",
                    "Borchaneng Wittaya School",
                    "Junior High School"
            ),
            Heading(application.getString(R.string.heading_interests), R.drawable.ic_whatshot),
            Heading(application.getString(R.string.heading_social), R.drawable.ic_earth_globe),
            SocialNetwork("peerapongsam", "peerapongsam", "peerapongsam")
    )
}
