package com.jutaav.login

import android.content.Context
import android.content.Intent
import com.jutaav.R
import com.jutaav.activity.ChooseLanguageActivity
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivitySignupOrganizationBinding
import com.wada811.viewbinding.viewBinding

class SignupOrganizationActivity :
    BaseActivity<ActivitySignupOrganizationBinding>(R.layout.activity_signup_organization) {

    override val binding: ActivitySignupOrganizationBinding by viewBinding(
        ActivitySignupOrganizationBinding::bind
    )

    override fun oViewInitialized() {
        binding.btnProceed.setOnClickListener { checkValidation() }
    }

    private fun checkValidation() {
        if (binding.etOrgName.text.toString().isEmpty() ||
            binding.tvOTP.otp.toString().isEmpty()
        ) {
            showShortToast(getString(R.string.error_org1))
        } else {
            ChooseLanguageActivity.startActivity(this)
        }
    }

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(getIntent(context))
        }

        fun getIntent(context: Context): Intent {
            return Intent(context, SignupOrganizationActivity::class.java)
        }
    }
}