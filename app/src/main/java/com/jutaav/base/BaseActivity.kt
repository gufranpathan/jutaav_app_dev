package com.jutaav.base

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.jutaav.R

open class BaseActivity : AppCompatActivity() {
    var dialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialog = Dialog(this)
    }

    fun showProgress() {
        dialog!!.setContentView(R.layout.loading)
        dialog!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialog!!.show()
    }

    fun hideProgress() {
        dialog!!.dismiss()
    }
    fun showToast(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }
}