package com.jutaav.login

import android.content.Intent
import android.util.Log
import com.jutaav.R
import com.jutaav.base.BaseActivity
import com.jutaav.databinding.ActivityLoginBinding
import com.jutaav.extensions.showShortToast
import com.wada811.viewbinding.viewBinding

class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    override val binding: ActivityLoginBinding by viewBinding {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
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
            if (binding.etMobilenumber.text.toString().isEmpty()) {
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