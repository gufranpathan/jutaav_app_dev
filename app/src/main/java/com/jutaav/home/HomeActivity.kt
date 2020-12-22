package com.jutaav.home

import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityHomeBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override val binding: ActivityHomeBinding by viewBinding(ActivityHomeBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
        } catch (e: Exception) {
        }
    }
}