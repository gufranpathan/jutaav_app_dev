package com.jutaav.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.jutaav.R
import com.jutaav.activity.CreateBroadcastListActivity
import com.jutaav.activity.ShareToWhatsAppActivity
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentFaqBinding
import com.jutaav.task.GeneralTaskListActivity
import com.jutaav.task.PhoneCallingTaskListActivity
import com.wada811.viewbinding.viewBinding

class FAQFragment : BaseFragment<FragmentFaqBinding>(R.layout.fragment_faq) {

    override val binding: FragmentFaqBinding by viewBinding(FragmentFaqBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBroadcastList.setOnClickListener {
            val intent = Intent(requireActivity(), CreateBroadcastListActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.btnShareToWhatsApp.setOnClickListener {
            val intent = Intent(requireActivity(), ShareToWhatsAppActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.btnPhoneCalling.setOnClickListener {
            val intent = Intent(requireActivity(), PhoneCallingTaskListActivity::class.java)
            activity?.startActivity(intent)
        }

        binding.btnGeneralTask.setOnClickListener {
            val intent = Intent(requireActivity(), GeneralTaskListActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}