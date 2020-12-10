package com.jutaav.login

import android.content.Intent
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivityLoginOtpBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class OTPActivity : BaseActivity<ActivityLoginOtpBinding>(R.layout.activity_login_otp) {
    override val binding: ActivityLoginOtpBinding by viewBinding(ActivityLoginOtpBinding::bind)

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            supportActionBar?.hide()
            binding.btnProceed.setOnClickListener { checkValidation() }
            binding.tvLoginwithemail.setOnClickListener {
                try {
                    val intent = Intent(this@OTPActivity, LoginEmailActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
        } catch (e: Exception) {
        }
    }

    private fun checkValidation() {
        try {
            if (binding.otpView.otp?.isEmpty() == true) {
                showShortToast(getString(R.string.error_otp1))
            } else {
                val intent = Intent(this@OTPActivity, SignupOrganizationActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
        }
    }
}