package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.MessageListAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentAddNewMessageBinding
import com.wada811.viewbinding.viewBinding

class AddNewMessageFragment :
    BaseFragment<FragmentAddNewMessageBinding>(R.layout.fragment_add_new_message) {

    override val binding: FragmentAddNewMessageBinding by viewBinding(
        FragmentAddNewMessageBinding::bind
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