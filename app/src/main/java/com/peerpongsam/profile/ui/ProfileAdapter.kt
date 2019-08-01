package com.peerpongsam.profile.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.peerpongsam.profile.R
import com.peerpongsam.profile.model.*

class ProfileAdapter : ListAdapter<Any, ProfileViewHolder>(object : DiffUtil.ItemCallback<Any?>() {
    override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
        return true
    }

    override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
        return true
    }
}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bindValue(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is Biography -> R.layout.item_biography
            is Education -> R.layout.item_education
            is Experience -> R.layout.item_work_experience
            is Heading -> R.layout.item_heading
            is SocialNetwork -> R.layout.item_social
            else -> super.getItemViewType(position)
        }
    }
}
