package com.jutaav.activity

import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityOnboardBinding
import com.wada811.viewbinding.viewBinding

class OnboardActivity : BaseActivity<ActivityOnboardBinding>(R.layout.activity_onboard) {

    override val binding: ActivityOnboardBinding by viewBinding(ActivityOnboardBinding::bind)

    override fun oViewInitialized() {

    }
}