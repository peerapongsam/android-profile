package com.peerpongsam.profile.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Experience(
    val start: Long,
    val end: Long,
    val position: String,
    val company: String,
    val location: String,
    val responsibilities: String?
) : Parcelable
