package com.jutaav.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jutaav.R
import com.jutaav.activity.SelectWorkSpaceActivity
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentFaqBinding
import com.wada811.viewbinding.viewBinding

class FAQFragment : BaseFragment<FragmentFaqBinding>(R.layout.fragment_faq) {

    override val binding: FragmentFaqBinding by viewBinding(FragmentFaqBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSelectWorkSpace.setOnClickListener {
            val intent = Intent(requireActivity(), SelectWorkSpaceActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.btnAddVolunteer.setOnClickListener {
            replaceFragment(AddVolunteerFromPhonebookFragment())
        }

        binding.btnCanvassingTasks.setOnClickListener {
            replaceFragment(CanvassingTasksFragment())
        }

        binding.btnCantFindContact.setOnClickListener {
            replaceFragment(SearchContactFragment())
        }

        binding.btnReferVolunteers.setOnClickListener {
            replaceFragment(ReferVolunteersFragment())
        }

        binding.btnSocialMediaTaskBrief.setOnClickListener {
            replaceFragment(SocialMediaTaskShareBriefFragment())
        }

        binding.btnAndroid68.setOnClickListener {
            replaceFragment(WhatsAppTasksTwoFragment())
        }

        binding.btnAndroid54.setOnClickListener {
            replaceFragment(WhatsAppTasksThreeFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frmMain, fragment)
        transaction?.disallowAddToBackStack()
        transaction?.commit()
    }
}