package com.peerpongsam.profile.model

data class Biography(
    val username: String? = "",
    val avatar: String? = "",
    val firstName: String? = "",
    val lastName: String? = "",
    val address: String? = "",
    val email: String? = "",
    val phone: String? = "",
    val birthDate: String? = "",
    val summary: String? = "",
    val relationship: String? = "",
    val nationality: String = "",
    val application: String = ""
)
