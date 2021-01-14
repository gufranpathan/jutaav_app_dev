package com.jutaav.login

import android.content.Context
import android.content.Intent
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginPasswordBinding
import com.wada811.viewbinding.viewBinding

class LoginPasswordActivity :
    BaseActivity<ActivityLoginPasswordBinding>(R.layout.activity_login_password) {

    override val binding: ActivityLoginPasswordBinding by viewBinding(ActivityLoginPasswordBinding::bind)

    override fun oViewInitialized() {
        binding.btnProceed.setOnClickListener { checkValidation() }
        binding.tvLoginwithmobile.setOnClickListener {
            LoginActivity.startActivity(this)
        }
    }

    private fun checkValidation() {
        if (binding.etPassword.text.toString().isEmpty()) {
            showShortToast(getString(R.string.error_login1))
        } else {
            SignupOrganizationActivity.startActivity(this)
        }
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(getIntent(context))
        }

        fun getIntent(context: Context): Intent {
            return Intent(context, LoginPasswordActivity::class.java)
        }
    }
}