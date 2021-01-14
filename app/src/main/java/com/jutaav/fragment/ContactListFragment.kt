package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.ContactListAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentContactListBinding
import com.wada811.viewbinding.viewBinding

class ContactListFragment :
    BaseFragment<FragmentContactListBinding>(R.layout.fragment_contact_list) {

    override val binding: FragmentContactListBinding by viewBinding(FragmentContactListBinding::bind)

    lateinit var contactListAdapter: ContactListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactListAdapter = ContactListAdapter()
        binding.rvContactList.apply {
            adapter = contactListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}