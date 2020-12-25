package com.jutaav.login

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
            val intent = Intent(this@LoginPasswordActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkValidation() {
        if (binding.etPassword.text.toString().isEmpty()) {
            showShortToast(getString(R.string.error_login1))
        } else {
            with(Intent(this@LoginPasswordActivity, SignupOrganizationActivity::class.java)) {
                startActivity(this)
            }
        }
    }
}