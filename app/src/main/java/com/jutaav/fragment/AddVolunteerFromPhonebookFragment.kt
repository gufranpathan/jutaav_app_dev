package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.AddVolunteerFromPhonebookAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentAddVolunteerFromPhonebookBinding
import com.wada811.viewbinding.viewBinding

class AddVolunteerFromPhonebookFragment :
    BaseFragment<FragmentAddVolunteerFromPhonebookBinding>(R.layout.fragment_add_volunteer_from_phonebook) {

    override val binding: FragmentAddVolunteerFromPhonebookBinding by viewBinding(
        FragmentAddVolunteerFromPhonebookBinding::bind
    )

    lateinit var contactsListAdapter: AddVolunteerFromPhonebookAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        contactsListAdapter = AddVolunteerFromPhonebookAdapter(requireContext())
        binding.rvListOfContacts.apply {
            adapter = contactsListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        super.onViewCreated(view, savedInstanceState)
    }
}