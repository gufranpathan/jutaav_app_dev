package com.jutaav.login

import android.content.Context
import android.content.Intent
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginEmailBinding
import com.wada811.viewbinding.viewBinding

class LoginEmailActivity : BaseActivity<ActivityLoginEmailBinding>(R.layout.activity_login_email) {
    override val binding: ActivityLoginEmailBinding by viewBinding(ActivityLoginEmailBinding::bind)

    override fun oViewInitialized() {
        binding.btnProceed.setOnClickListener { checkValidation() }

        binding.tvSignInViaOTP.setOnClickListener {
            val intent = Intent(this@LoginEmailActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkValidation() {
        if (binding.etEmail.text.toString().isEmpty()) {
            showShortToast(getString(R.string.error_login1))
        } else {
            val intent = Intent(this@LoginEmailActivity, LoginPasswordActivity::class.java)
            startActivity(intent)
        }
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(getIntent(context))
        }

        fun getIntent(context: Context): Intent {
            return Intent(context, LoginEmailActivity::class.java)
        }
    }
}