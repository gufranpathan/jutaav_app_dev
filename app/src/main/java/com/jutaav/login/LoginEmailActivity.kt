package com.jutaav.login

import android.content.Intent
import android.util.Log
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginEmailBinding
import com.wada811.viewbinding.viewBinding

class LoginEmailActivity : BaseActivity<ActivityLoginEmailBinding>() {
    override val binding: ActivityLoginEmailBinding by viewBinding {
        ActivityLoginEmailBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
        try {
            supportActionBar?.hide()
            binding.btnProceed.setOnClickListener { checkValidation() }
            binding.tvLoginwithmobile.setOnClickListener {
                try {
                    val intent = Intent(this@LoginEmailActivity, LoginActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
        } catch (e: Exception) {
        }
    }

    private fun checkValidation() {
        try {
            if (binding.etEmail.text.toString().isEmpty()) {
                showShortToast(getString(R.string.error_login1))
            } else {
                val intent = Intent(this@LoginEmailActivity, LoginPasswordActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
            e.message?.let { Log.e("error login", it) }
        }
    }
}