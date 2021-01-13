package com.jutaav.activity

import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityChooseLanguageBinding
import com.wada811.viewbinding.viewBinding

class ChooseLanguageActivity :
    BaseActivity<ActivityChooseLanguageBinding>(R.layout.activity_choose_language) {

    override val binding: ActivityChooseLanguageBinding by viewBinding(ActivityChooseLanguageBinding::bind)

    override fun oViewInitialized() {
        binding.llEnglish.setOnClickListener {
            startActivity(WSLoadingActivity.getIntent(this@ChooseLanguageActivity))
        }
    }
}