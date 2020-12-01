package com.jutaav.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.jutaav.R
import com.jutaav.base.BaseActivity
import com.jutaav.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }
    private fun init() {
        try {
            supportActionBar?.hide();

            btn_proceed.setOnClickListener({checkvalidation()})
            tv_loginwithemail.setOnClickListener({
                try {
                    val intent = Intent(this@LoginActivity, LoginEmailActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            })
        } catch (e: Exception) {
        }
    }


    private fun checkvalidation() {
        try {
            if (et_mobilenumber.text.toString().isEmpty())
            {
               showToast(getString(R.string.error_login1))
            }
            else
            {
                val intent = Intent(this@LoginActivity, OTPActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
            e?.message?.let { Log.e("error login", it) }
        }
    }
}