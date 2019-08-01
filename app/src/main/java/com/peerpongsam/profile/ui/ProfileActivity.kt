package com.peerpongsam.profile.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders
import com.peerpongsam.profile.BR
import com.peerpongsam.profile.R
import kotlinx.android.synthetic.main.activity_profile.toolbar
import androidx.appcompat.app.AppCompatDelegate

class ProfileActivity : AppCompatActivity() {

    lateinit var profileViewModel: ProfileViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_profile).apply {
            lifecycleOwner = this@ProfileActivity
            setVariable(BR.viewModel, profileViewModel)
        }
        setSupportActionBar(toolbar)
    }
}
