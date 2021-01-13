package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.TaskListWOImageAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentWhatsAppTasksOneBinding
import com.wada811.viewbinding.viewBinding

class WhatsAppTasksOneFragment :
    BaseFragment<FragmentWhatsAppTasksOneBinding>(R.layout.fragment_whats_app_tasks_one) {

    override val binding: FragmentWhatsAppTasksOneBinding by viewBinding(
        FragmentWhatsAppTasksOneBinding::bind
    )

    lateinit var taskListAdapter: TaskListWOImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = TaskListWOImageAdapter()
        binding.rvWhatsAppTaskListOne.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}