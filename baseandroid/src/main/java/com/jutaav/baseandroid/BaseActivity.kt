package com.jutaav.baseandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * Created by viking_93 on 10/12/2020
 **/

abstract class BaseActivity<BINDING : ViewBinding> : AppCompatActivity() {
    protected abstract val binding: BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        oViewInitialized()
    }

    abstract fun oViewInitialized()
}