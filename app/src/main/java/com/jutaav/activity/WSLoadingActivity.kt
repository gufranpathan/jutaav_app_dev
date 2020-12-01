package com.jutaav.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat
import com.hussain_chachuliya.gifdialog.GifDialog
import com.jutaav.R
import com.jutaav.base.BaseActivity
import com.jutaav.config.CommonFunctions
import com.jutaav.config.Constants
import com.jutaav.home.HomeActivity
import com.jutaav.login.LoginActivity

class WSLoadingActivity : BaseActivity() {
    var dialog1: GifDialog? = null
    var dialog2: GifDialog? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_w_s_loading)
        init()
    }

    private fun init() {
        try {
            supportActionBar?.hide()

            dialog1 = GifDialog.with(this)
            dialog1!!.isCancelable(false)

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