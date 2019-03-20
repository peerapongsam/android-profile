package com.peerpongsam.resume.model

data class Experience(
    val duration: String,
    val position: String,
    val place: String,
    val location: String,
    val responsibilities: List<String> = emptyList()
)
