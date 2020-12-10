package com.jutaav.login

import android.content.Intent
import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivitySignupOrganizationBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class SignupOrganizationActivity :
    BaseActivity<ActivitySignupOrganizationBinding>(R.layout.activity_signup_organization) {
    override val binding: ActivitySignupOrganizationBinding by viewBinding(
        ActivitySignupOrganizationBinding::bind
    )

    override fun oViewInitialized() {
        Timber.tag(tag()).i("${this::class.java.simpleName} Opened")
        try {
            supportActionBar?.hide()
            binding.btnProceed.setOnClickListener { checkValidation() }
        } catch (e: Exception) {
        }
    }

    private fun checkValidation() {
        try {
            if (binding.etOrgName.text.toString().isEmpty() ||
                binding.otpView.otp.toString().isEmpty()
            ) {
                showShortToast(getString(R.string.error_org1))
            } else {
                try {
                    val intent =
                        Intent(this@SignupOrganizationActivity, SignupOrgNameActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            }
        } catch (e: Exception) {
        }
    }


}