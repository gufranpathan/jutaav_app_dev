package com.jutaav

import android.content.Intent
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.getPreference
import com.jutaav.databinding.ActivitySplashBinding
import com.jutaav.home.HomeActivity
import com.jutaav.login.LoginActivity
import com.jutaav.login.PREFS_NAME_LOGIN
import com.jutaav.login.PREF_KEY_IS_LOGIN
import com.wada811.viewbinding.viewBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import timber.log.Timber
import java.util.concurrent.TimeUnit

const val SPLASH_TIME_OUT: Long = 1

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    override val binding: ActivitySplashBinding by viewBinding(ActivitySplashBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            compositeDisposable.add(
                Single.just(Unit)
                    .delay(SPLASH_TIME_OUT, TimeUnit.SECONDS)
                    .subscribeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        if (getPreference(PREFS_NAME_LOGIN).getBoolean(PREF_KEY_IS_LOGIN, false)) {
                            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }) {}
            )
        } catch (e: Exception) {
        }
    }
}