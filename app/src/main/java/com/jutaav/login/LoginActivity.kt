package com.jutaav.login

import android.content.Intent
import android.util.Log
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    override val binding: ActivityLoginBinding by viewBinding(ActivityLoginBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            supportActionBar?.hide()

            binding.btnProceed.setOnClickListener { checkValidation() }
            binding.tvLoginwithemail.setOnClickListener {
                try {
                    val intent = Intent(this, LoginEmailActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
        } catch (e: Exception) {
        }
    }

    private fun checkValidation() {
        try {
            if (binding.etMobileNumber.text.toString().isEmpty()) {
                showShortToast(getString(R.string.error_login1))
            } else {
                val intent = Intent(this@LoginActivity, OTPActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("error login", it) }
        }
    }
}