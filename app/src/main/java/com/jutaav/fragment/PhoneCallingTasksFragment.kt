package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.PhoneCallingTaskListAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentPhoneCallingTasksBinding
import com.wada811.viewbinding.viewBinding

class PhoneCallingTasksFragment :
    BaseFragment<FragmentPhoneCallingTasksBinding>(R.layout.fragment_phone_calling_tasks) {

    override val binding: FragmentPhoneCallingTasksBinding by viewBinding(
        FragmentPhoneCallingTasksBinding::bind
    )

    lateinit var taskListAdapter: PhoneCallingTaskListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = PhoneCallingTaskListAdapter()
        binding.rvPhoneCallingTasks.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}