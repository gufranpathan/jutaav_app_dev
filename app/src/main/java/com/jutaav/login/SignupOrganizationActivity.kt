package com.jutaav.login

import android.content.Intent
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivitySignupOrganizationBinding
import com.wada811.viewbinding.viewBinding

class SignupOrganizationActivity : BaseActivity<ActivitySignupOrganizationBinding>() {
    override val binding: ActivitySignupOrganizationBinding by viewBinding {
        ActivitySignupOrganizationBinding.inflate(layoutInflater)
    }

    override fun oViewInitialized() {
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