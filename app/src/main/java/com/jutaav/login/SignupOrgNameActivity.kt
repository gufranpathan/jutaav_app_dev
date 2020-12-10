package com.jutaav.login

import android.content.Intent
import com.jutaav.R
import com.jutaav.activity.WSLoadingActivity
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.ActivitySignupOrgNameBinding
import com.wada811.viewbinding.viewBinding

class SignupOrgNameActivity : BaseActivity<ActivitySignupOrgNameBinding>() {
    override val binding: ActivitySignupOrgNameBinding by viewBinding {
        ActivitySignupOrgNameBinding.inflate(layoutInflater)
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
            if (binding.etOrgName.text.toString().trim().isEmpty()) {
                showShortToast(getString(R.string.error_org1))
            } else {
                val intent = Intent(this@SignupOrgNameActivity, WSLoadingActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
        }
    }


}