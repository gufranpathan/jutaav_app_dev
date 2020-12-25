package com.jutaav.baseandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * Created by viking_93 on 10/12/2020
 **/

abstract class BaseFragment<BINDING : ViewBinding>(@LayoutRes val layoutRes: Int) : Fragment() {
    abstract val binding: BINDING

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate(layoutRes, container, true)
    }
}