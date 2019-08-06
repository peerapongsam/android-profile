package com.peerpongsam.profile.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.peerpongsam.profile.BR
import com.peerpongsam.profile.model.AboutMe
import com.peerpongsam.profile.model.Biography
import com.peerpongsam.profile.model.Education
import com.peerpongsam.profile.model.Experience
import com.peerpongsam.profile.model.Heading
import com.peerpongsam.profile.model.Site
import com.peerpongsam.profile.utils.executeAfter

class ProfileViewHolder(private val binding: ViewDataBinding) : ViewHolder(binding.root) {

    constructor(parent: ViewGroup, layoutId: Int) : this(
        DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), layoutId,
            parent,
            false
        )
    )

    fun bindValue(item: Any) {
        binding.executeAfter {
            when (item) {
                is Biography -> setVariable(BR.biography, item)
                is AboutMe -> setVariable(BR.about, item)
                is Education -> setVariable(BR.education, item)
                is Experience -> setVariable(BR.experience, item)
                is Heading -> setVariable(BR.heading, item)
                is Site -> setVariable(BR.site, item)
            }
        }
    }
}
