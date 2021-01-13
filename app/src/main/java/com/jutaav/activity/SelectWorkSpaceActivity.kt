package com.jutaav.activity

import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivitySelectWorkspaceBinding
import com.wada811.viewbinding.viewBinding

class SelectWorkSpaceActivity :
    BaseActivity<ActivitySelectWorkspaceBinding>(R.layout.activity_select_workspace) {

    override val binding: ActivitySelectWorkspaceBinding by viewBinding(
        ActivitySelectWorkspaceBinding::bind
    )

    override fun oViewInitialized() {

    }
}