package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.MessageListAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentMessageListBinding
import com.wada811.viewbinding.viewBinding

class MessageListFragment :
    BaseFragment<FragmentMessageListBinding>(R.layout.fragment_message_list) {

    override val binding: FragmentMessageListBinding by viewBinding(
        FragmentMessageListBinding::bind
    )

    lateinit var messageListAdapter: MessageListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        messageListAdapter = MessageListAdapter()
        binding.rvMessageList.apply {
            adapter = messageListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}