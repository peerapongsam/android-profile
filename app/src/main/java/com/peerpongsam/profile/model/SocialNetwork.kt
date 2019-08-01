package com.peerpongsam.profile.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SocialNetwork(
        val github: String?,
        val facebook: String?,
        val linkedIn: String?
) : Parcelable {
}