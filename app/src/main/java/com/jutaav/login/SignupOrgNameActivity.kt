package com.jutaav.login

import `in`.aabhasjindal.otptextview.OTPListener
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import com.jutaav.R
import com.jutaav.activity.WSLoadingActivity
import com.jutaav.base.BaseActivity

import kotlinx.android.synthetic.main.activity_login.btn_proceed
import kotlinx.android.synthetic.main.activity_login_otp.*
import kotlinx.android.synthetic.main.activity_signup_organization.*


class SignupOrgNameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_org_name)
        init()
    }
    private fun init() {
        try {

            supportActionBar?.hide();
            btn_proceed.setOnClickListener { checkvalidation() }
        } catch (e: Exception) {
        }
    }

    private fun checkvalidation()
    {
        try {
            if(et_org_name.text.toString().trim().isEmpty())
            {
                showToast(getString(R.string.error_org1))
            }
            else
            {
                val intent = Intent(this@SignupOrgNameActivity, WSLoadingActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
        }
    }


}