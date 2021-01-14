package com.jutaav.fragment

import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentEditProfileBinding
import com.wada811.viewbinding.viewBinding

class EditProfileFragment :
    BaseFragment<FragmentEditProfileBinding>(R.layout.fragment_edit_profile) {

    override val binding: FragmentEditProfileBinding by viewBinding(FragmentEditProfileBinding::bind)
}