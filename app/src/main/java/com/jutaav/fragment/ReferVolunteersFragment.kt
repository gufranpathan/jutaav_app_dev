package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.baseandroid.extensions.showShortToast
import com.jutaav.databinding.FragmentReferVolunteersBinding
import com.wada811.viewbinding.viewBinding

class ReferVolunteersFragment :
    BaseFragment<FragmentReferVolunteersBinding>(R.layout.fragment_refer_volunteers) {

    override val binding: FragmentReferVolunteersBinding by viewBinding(
        FragmentReferVolunteersBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.etReferLink.setOnClickListener {
            requireContext().showShortToast(getString(R.string.str_copied_to_clipboard))
        }
        super.onViewCreated(view, savedInstanceState)
    }
}