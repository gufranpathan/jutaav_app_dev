package com.jutaav.activity

import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityEditProfileBinding
import com.wada811.viewbinding.viewBinding

class EditProfileActivity :
    BaseActivity<ActivityEditProfileBinding>(R.layout.activity_edit_profile) {

    override val binding: ActivityEditProfileBinding by viewBinding(ActivityEditProfileBinding::bind)

    override fun oViewInitialized() {

    }
}