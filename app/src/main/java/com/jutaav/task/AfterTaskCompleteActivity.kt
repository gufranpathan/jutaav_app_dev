package com.jutaav.task

import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityAfterTaskCompleteBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class AfterTaskCompleteActivity :
    BaseActivity<ActivityAfterTaskCompleteBinding>(R.layout.activity_after_task_complete) {

    override val binding: ActivityAfterTaskCompleteBinding by viewBinding(
        ActivityAfterTaskCompleteBinding::bind
    )

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            /*binding.llEnglish.setOnClickListener {
                val intent =
                    Intent(this@ChooseLanguageActivity, WSLoadingActivity::class.java)
                startActivity(intent)
            }*/
        } catch (e: Exception) {
        }
    }
}