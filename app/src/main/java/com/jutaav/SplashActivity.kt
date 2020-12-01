package com.jutaav

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.jutaav.base.BaseActivity
import com.jutaav.config.CommonFunctions
import com.jutaav.config.Constants
import com.jutaav.home.HomeActivity
import com.jutaav.login.LoginActivity


class SplashActivity : BaseActivity() {
    val SPLASH_TIME_OUT :Long= 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init();
    }

    private fun init() {
        try {
                supportActionBar?.hide();
            Handler().postDelayed(Runnable {
                if (CommonFunctions.getPreference(this@SplashActivity, Constants.isLogin, false)) {
                        val intent = Intent(this@SplashActivity, HomeActivity::class.java)
                        startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this@SplashActivity, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }, SPLASH_TIME_OUT)
        } catch (e: Exception) {
        }
    }
}