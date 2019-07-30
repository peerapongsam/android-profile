package com.peerpongsam.resume.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.peerpongsam.resume.ui.ProfileAdapter

object DataBindingAdapters {

    @JvmStatic
    @BindingAdapter("imageUrl")
    fun setImageUrl(view: ImageView, url: String) {
        Glide.with(view)
                .load(url)
                .circleCrop()
                .into(view)
    }


    @JvmStatic
    @BindingAdapter("profiles")
    fun setProfileItems(view: RecyclerView, items: List<Any>) {
        if (view.adapter == null) {
            view.adapter = ProfileAdapter()
        }
        (view.adapter as? ProfileAdapter)?.submitList(items)
    }

}
