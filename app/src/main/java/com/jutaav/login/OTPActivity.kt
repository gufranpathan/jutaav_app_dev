package com.jutaav.login

import `in`.aabhasjindal.otptextview.OTPListener
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isEmpty
import com.jutaav.R
import com.jutaav.base.BaseActivity

import kotlinx.android.synthetic.main.activity_login.btn_proceed
import kotlinx.android.synthetic.main.activity_login_otp.*


class OTPActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_otp)
        init()
    }
    private fun init() {
        try {
            supportActionBar?.hide();
            btn_proceed.setOnClickListener { checkvalidation() }
            tv_loginwithemail.setOnClickListener {
               try {
                   val intent = Intent(this@OTPActivity, LoginEmailActivity::class.java)
                   startActivity(intent)
               } catch (e: Exception) {
               }
            }
        } catch (e: Exception) {
        }
    }

    private fun checkvalidation() {
        try {
            if(otp_view?.otp?.isEmpty() == true)
            {
                showToast(getString(R.string.error_otp1))
            }
            else
            {
                val intent = Intent(this@OTPActivity, SignupOrganizationActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
        }
    }
}