package com.jutaav.baseandroid

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.jutaav.base.BaseAutoDisposable
import com.jutaav.base.BaseAutoDisposableImplementation

/**
 * Created by viking_93 on 10/12/2020
 **/

abstract class BaseActivity<BINDING : ViewBinding>(@LayoutRes layoutRes: Int) :
    AppCompatActivity(layoutRes), BaseAutoDisposable by BaseAutoDisposableImplementation() {

    protected abstract val binding: BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oViewInitialized()
    }

    abstract fun oViewInitialized()
}