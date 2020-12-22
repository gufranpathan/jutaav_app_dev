package com.jutaav.activity

import android.content.Intent
import com.bumptech.glide.Glide
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityWSLoadingBinding
import com.jutaav.task.TaskCompleteActivity
import com.wada811.viewbinding.viewBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import timber.log.Timber
import java.util.concurrent.TimeUnit

class WSLoadingActivity : BaseActivity<ActivityWSLoadingBinding>(R.layout.activity_w_s_loading) {

    override val binding: ActivityWSLoadingBinding by viewBinding(ActivityWSLoadingBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {

            Glide.with(this)
                .load(R.raw.giphy6)
                .into(binding.ivLoading)

            compositeDisposable.add(
                Single.just(Unit)
                    .delay(4, TimeUnit.SECONDS)
                    .subscribeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        //val intent = Intent(this@WSLoadingActivity, HomeActivity::class.java)
                        val intent =
                            Intent(this@WSLoadingActivity, TaskCompleteActivity::class.java)
                        startActivity(intent)
                        finish()
                    }) {}
            )

        } catch (e: Exception) {
        }
    }
}