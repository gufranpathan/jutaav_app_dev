package com.jutaav.login

import android.content.Context
import android.content.Intent
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginBinding
import com.wada811.viewbinding.viewBinding

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {

    override val binding: ActivityLoginBinding by viewBinding(ActivityLoginBinding::bind)

    override fun oViewInitialized() {
        binding.btnProceed.setOnClickListener { checkValidation() }

        binding.tvLoginViaEmail.setOnClickListener {
            val intent = Intent(this, LoginEmailActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkValidation() {
        if (binding.etMobileNumber.text.toString().isEmpty()) {
            showShortToast(getString(R.string.error_login1))
        } else {
            OTPActivity.startActivity(this)
        }
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(getIntent(context))
        }

        fun getIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }
}