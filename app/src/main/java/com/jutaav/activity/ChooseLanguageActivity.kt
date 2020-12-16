package com.jutaav.activity

import android.content.Intent
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityChooseLanguageBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class ChooseLanguageActivity :
    BaseActivity<ActivityChooseLanguageBinding>(R.layout.activity_choose_language) {

    override val binding: ActivityChooseLanguageBinding by viewBinding(ActivityChooseLanguageBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        binding.llEnglish.setOnClickListener {
            val intent =
                Intent(this@ChooseLanguageActivity, WSLoadingActivity::class.java)
            startActivity(intent)
        }
    }
}