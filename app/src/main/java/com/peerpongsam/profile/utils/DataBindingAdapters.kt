package com.peerpongsam.profile.utils

import android.graphics.drawable.Drawable
import android.graphics.drawable.PictureDrawable
import android.net.Uri
import android.text.SpannableStringBuilder
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.ImageViewTarget
import com.bumptech.glide.request.target.Target
import com.peerpongsam.profile.R
import com.peerpongsam.profile.ui.ProfileAdapter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

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
    @BindingAdapter("startTime", "endTime")
    fun setDateTime(view: TextView, start: Long, end: Long) {
        val format = SimpleDateFormat("yyyy", Locale.getDefault())
        val builder = SpannableStringBuilder()
        builder.append(format.format(Date(start)))
        builder.append(" - ")
        if (end == 0L) {
            builder.append(view.context.getString(R.string.present))
        } else {
            builder.append(format.format(Date(end)))
        }
        view.text = builder
    }

    @JvmStatic
    @BindingAdapter("profiles")
    fun setProfileItems(view: RecyclerView, items: List<Any>) {
        if (view.adapter == null) {
            view.adapter = ProfileAdapter()
        }
        (view.adapter as? ProfileAdapter)?.submitList(items)
    }

    @JvmStatic
    @BindingAdapter("android:drawableStart")
    fun setDrawableStart(view: TextView, resId: Int) {
        val drawable = ContextCompat.getDrawable(view.context, resId)
        setIntrinsicBounds(drawable)
        val drawablesRelative = view.compoundDrawablesRelative
        view.setCompoundDrawablesRelative(
            drawable, drawablesRelative[1], drawablesRelative[2], drawablesRelative[3]
        )
    }

    @JvmStatic
    @BindingAdapter("siteUrl")
    fun setSiteUrl(view: ImageView, siteUrl: String?) {
        if (siteUrl == null) return
        val uri = Uri.parse(siteUrl)
        val siteName = uri.host?.replace("www.", "")
            ?.replace("(.com|.net|.me|.xyz)".toRegex(), "")
        GlideApp.with(view)
            .`as`(PictureDrawable::class.java)
            .placeholder(R.drawable.ic_link)
            .error(R.drawable.ic_link)
            .listener(SvgSoftwareLayerSetter())
            .load("https://cdnjs.cloudflare.com/ajax/libs/simple-icons/3.0.1/$siteName.svg")
            .into(view)
    }

    private fun setIntrinsicBounds(drawable: Drawable?) {
        drawable?.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
    }
}
