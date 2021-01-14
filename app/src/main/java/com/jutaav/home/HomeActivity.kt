package com.jutaav.home

import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.baseandroid.extensions.addFragment
import com.jutaav.baseandroid.extensions.replaceFragment
import com.jutaav.databinding.ActivityHomeBinding
import com.jutaav.fragment.*
import com.wada811.viewbinding.viewBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override val binding: ActivityHomeBinding by viewBinding(ActivityHomeBinding::bind)

    override fun oViewInitialized() {

        val fragment = AddNewContactFragment()
        addFragment(fragment, R.id.frmMain)

        binding.tvMyProfile.setOnClickListener {
            replaceFragment(AddNewContactFragment(), R.id.frmMain)
        }

        binding.tvHelpAndFaq.setOnClickListener {
            replaceFragment(FAQFragment(), R.id.frmMain)
        }

        binding.tvMyTasks.setOnClickListener {
            replaceFragment(ContactListFragment(), R.id.frmMain)
        }

        binding.tvCommunity.setOnClickListener {
            replaceFragment(LinkPhonebookFragment(), R.id.frmMain)
        }

        binding.tvMessages.setOnClickListener {
            replaceFragment(EditProfileFragment(), R.id.frmMain)
        }
    }
}