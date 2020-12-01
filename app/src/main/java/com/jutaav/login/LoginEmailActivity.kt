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
import kotlinx.android.synthetic.main.activity_login.btn_proceed
import kotlinx.android.synthetic.main.activity_login_email.*

class LoginEmailActivity : BaseActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_email)
        init()
    }
    private fun init() {
        try {
            supportActionBar?.hide();
            btn_proceed.setOnClickListener({checkvalidation()})
            tv_loginwithmobile.setOnClickListener({
                try {
                    val intent = Intent(this@LoginEmailActivity, LoginActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                }
            })
        } catch (e: Exception) {
        }
    }


    private fun checkvalidation() {
        try {
            if (et_email.text.toString().isEmpty())
            {
               showToast(getString(R.string.error_login1))
            }
            else
            {
                val intent = Intent(this@LoginEmailActivity, LoginPasswordActivity::class.java)
                startActivity(intent)
            }
        } catch (e: Exception) {
            e?.message?.let { Log.e("error login", it) }
        }
    }
}