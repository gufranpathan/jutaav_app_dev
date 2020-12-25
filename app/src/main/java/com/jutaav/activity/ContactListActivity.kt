package com.jutaav.activity

import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.ContactListAdapter
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityContactListBinding
import com.wada811.viewbinding.viewBinding

class ContactListActivity :
    BaseActivity<ActivityContactListBinding>(R.layout.activity_contact_list) {

    override val binding: ActivityContactListBinding by viewBinding(ActivityContactListBinding::bind)

    lateinit var contactListAdapter: ContactListAdapter

    override fun oViewInitialized() {
        contactListAdapter = ContactListAdapter()
        binding.rvContactList.apply {
            adapter = contactListAdapter
            layoutManager = LinearLayoutManager(this@ContactListActivity)
        }
    }
}