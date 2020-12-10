package com.jutaav.login

import android.content.Intent
import android.util.Log
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginPasswordBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class LoginPasswordActivity :
    BaseActivity<ActivityLoginPasswordBinding>(R.layout.activity_login_password) {
    override val binding: ActivityLoginPasswordBinding by viewBinding(ActivityLoginPasswordBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            supportActionBar?.hide()
            binding.btnProceed.setOnClickListener { checkValidation() }
            binding.tvLoginwithmobile.setOnClickListener {
                try {
                    val intent = Intent(this@LoginPasswordActivity, LoginActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
        } catch (e: Exception) {
        }
    }

    private fun checkValidation() {
        try {
            if (binding.etPassword.text.toString().isEmpty()) {
                showShortToast(getString(R.string.error_login1))
            } else {
                with(Intent(this@LoginPasswordActivity, SignupOrganizationActivity::class.java)) {
                    startActivity(this)
                }
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("error login", it) }
        }
    }
}