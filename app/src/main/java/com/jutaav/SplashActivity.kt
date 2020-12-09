package com.jutaav

import android.content.Intent
import android.os.Handler
import com.jutaav.base.BaseActivity
import com.jutaav.databinding.ActivitySplashBinding
import com.jutaav.extensions.getPreference
import com.jutaav.home.HomeActivity
import com.jutaav.login.LoginActivity
import com.jutaav.login.PREFS_NAME_LOGIN
import com.jutaav.login.PREF_KEY_IS_LOGIN
import com.wada811.viewbinding.viewBinding

const val SPLASH_TIME_OUT: Long = 1000

class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    override val binding: ActivitySplashBinding by viewBinding {
        ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
        try {
            supportActionBar?.hide()
            Handler().postDelayed({
                if (getPreference(PREFS_NAME_LOGIN).getBoolean(PREF_KEY_IS_LOGIN, false)) {
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