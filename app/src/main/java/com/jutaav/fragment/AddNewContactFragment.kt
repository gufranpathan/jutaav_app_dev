package com.jutaav.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentAddNewContactBinding
import com.jutaav.login.LoginPasswordActivity
import com.jutaav.login.SignupOrgNameActivity
import com.wada811.viewbinding.viewBinding

class AddNewContactFragment :
    BaseFragment<FragmentAddNewContactBinding>(R.layout.fragment_add_new_contact) {

    override val binding: FragmentAddNewContactBinding by viewBinding(FragmentAddNewContactBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mbAddNewContact.setOnClickListener {
            val intent = Intent(requireActivity(), LoginPasswordActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.mbSaveChanges.setOnClickListener {
            val intent = Intent(requireActivity(), SignupOrgNameActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}