package com.jutaav.task

import android.content.Intent
import com.jutaav.R
import com.jutaav.activity.WSLoadingActivity
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityTaskCompleteBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class TaskCompleteActivity :
    BaseActivity<ActivityTaskCompleteBinding>(R.layout.activity_task_complete) {

    override val binding: ActivityTaskCompleteBinding by viewBinding(
        ActivityTaskCompleteBinding::bind
    )

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            binding.mcrdSuccessIllustration.setOnClickListener {
                val intent =
                    Intent(this@TaskCompleteActivity, AfterTaskCompleteActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
        }
    }
}