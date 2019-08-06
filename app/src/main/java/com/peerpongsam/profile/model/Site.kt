package com.peerpongsam.profile.model

import android.os.Parcelable
import com.peerpongsam.profile.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Site(
    val url: String?
) : Parcelable
