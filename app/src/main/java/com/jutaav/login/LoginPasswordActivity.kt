package com.jutaav.login

import android.content.Intent
import android.util.Log
import com.jutaav.R
import com.jutaav.base.BaseActivity
import com.jutaav.databinding.ActivityLoginPasswordBinding
import com.jutaav.extensions.showShortToast
import com.wada811.viewbinding.viewBinding

class LoginPasswordActivity : BaseActivity<ActivityLoginPasswordBinding>() {
    override val binding: ActivityLoginPasswordBinding by viewBinding {
        ActivityLoginPasswordBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
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