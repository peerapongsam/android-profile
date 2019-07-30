package com.peerpongsam.resume.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Experience(
        val duration: String,
        val position: String,
        val place: String,
        val location: String,
        val responsibilities: List<String> = emptyList()
) : Parcelable
