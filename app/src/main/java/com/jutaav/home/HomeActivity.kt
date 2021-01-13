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

        //val fragment = AddNewContactFragment()
        //val fragment = MyTasksBoardFragment()
        //val fragment = ActiveTasksFragment()
        //val fragment = SocialMediaTaskShareBriefFragment()
        val fragment = SocialMediaTasksFragment()
        //val fragment = MessageListFragment()
        //val fragment = CanvassingTasksFragment()
        //val fragment = AddVolunteerFromPhonebookFragment()
        //val fragment = AddNewMessageFragment()
        //val fragment = PhoneCallingTasksFragment()
        //val fragment = SearchContactFragment()
        //val fragment = ReferVolunteersFragment()
        addFragment(fragment, R.id.frmMain)

        binding.tvMyProfile.setOnClickListener {
            replaceFragment(SocialMediaTasksFragment(), R.id.frmMain)
        }

        binding.tvCommunity.setOnClickListener {
            replaceFragment(MessageListFragment(), R.id.frmMain)
        }

        binding.tvMyTasks.setOnClickListener {
            replaceFragment(MyTasksBoardFragment(), R.id.frmMain)
        }

        binding.tvMessages.setOnClickListener {
            replaceFragment(AddNewMessageFragment(), R.id.frmMain)
        }

        binding.tvHelpAndFaq.setOnClickListener {
            replaceFragment(FAQFragment(), R.id.frmMain)
        }
    }
}