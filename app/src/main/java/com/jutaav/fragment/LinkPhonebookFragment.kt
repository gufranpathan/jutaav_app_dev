package com.jutaav.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.jutaav.R
import com.jutaav.activity.OnboardActivity
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentLinkPhonebookBinding
import com.wada811.viewbinding.viewBinding

class LinkPhonebookFragment :
    BaseFragment<FragmentLinkPhonebookBinding>(R.layout.fragment_link_phonebook) {

    override val binding: FragmentLinkPhonebookBinding by viewBinding(FragmentLinkPhonebookBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mbLinkphonebook.setOnClickListener {
            val intent = Intent(requireActivity(), OnboardActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}