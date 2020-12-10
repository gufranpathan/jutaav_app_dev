package com.jutaav.activity

import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityChooseLanguageBinding
import com.wada811.viewbinding.viewBinding

class ChooseLanguageActivity : BaseActivity<ActivityChooseLanguageBinding>() {

    override val binding: ActivityChooseLanguageBinding by viewBinding {
        ActivityChooseLanguageBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
        try {

        } catch (e: Exception) {
        }
    }
}