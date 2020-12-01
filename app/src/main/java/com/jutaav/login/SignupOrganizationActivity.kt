package com.jutaav.login

import `in`.aabhasjindal.otptextview.OTPListener
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import com.jutaav.R
import com.jutaav.base.BaseActivity
import kotlinx.android.synthetic.main.activity_signup_organization.*


class SignupOrganizationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_organization)
        init()
    }
    private fun init() {
        try {
            supportActionBar?.hide();
            btn_proceed.setOnClickListener { checkvalidation() }
        } catch (e: Exception) {
        }
    }

    private fun checkvalidation() {
        try {
                if(et_org_name.text.toString().isEmpty() || otp_view.otp.toString().isEmpty())
                {
                    showToast(getString(R.string.error_org1))
                }
                else
                {
                    try {
                        val intent = Intent(this@SignupOrganizationActivity, SignupOrgNameActivity::class.java)
                        startActivity(intent)
                    } catch (e: Exception) {
                    }
                }
        } catch (e: Exception) {
        }
    }


}