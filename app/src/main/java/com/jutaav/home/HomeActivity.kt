package com.jutaav.home

import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityHomeBinding
import com.wada811.viewbinding.viewBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override val binding: ActivityHomeBinding by viewBinding {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
        try {
            supportActionBar?.hide()
        } catch (e: Exception) {
        }
    }
}