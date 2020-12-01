package com.jutaav.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jutaav.R
import com.jutaav.base.BaseActivity

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init() {
        try {
            supportActionBar?.hide()
        } catch (e: Exception) {
        }
    }
}