package com.jutaav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentAddNewContactBinding
import com.wada811.viewbinding.viewBinding

class AddNewContactFragment : BaseFragment<FragmentAddNewContactBinding>() {

    override val binding: FragmentAddNewContactBinding by viewBinding(FragmentAddNewContactBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //return inflater.inflate(R.layout.fragment_add_new_contact, container, false)
        return binding.root
    }
}