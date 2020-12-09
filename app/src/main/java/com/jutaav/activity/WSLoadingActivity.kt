package com.jutaav.activity

import android.content.Intent
import android.os.Handler
import androidx.core.content.ContextCompat
import com.hussain_chachuliya.gifdialog.GifDialog
import com.jutaav.R
import com.jutaav.base.BaseActivity
import com.jutaav.databinding.ActivityWSLoadingBinding
import com.jutaav.home.HomeActivity
import com.wada811.viewbinding.viewBinding

class WSLoadingActivity : BaseActivity<ActivityWSLoadingBinding>() {
    lateinit var dialog1: GifDialog

    override val binding: ActivityWSLoadingBinding by viewBinding {
        ActivityWSLoadingBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
        try {
            supportActionBar?.hide()

            dialog1 = GifDialog.with(this)
            dialog1.isCancelable(false)
                .setTextBackgroundColor(ContextCompat.getColor(this, android.R.color.white))
                .setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
                .setResourceId(R.drawable.giphy6)
                .showDialog("1")

            Handler().postDelayed(Runnable {
                val intent = Intent(this@WSLoadingActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }, 4000)
        } catch (e: Exception) {
        }
    }
}