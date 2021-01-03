package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.TaskListWOImageAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentWhatsAppTasksTwoBinding
import com.wada811.viewbinding.viewBinding

class WhatsAppTasksTwoFragment :
    BaseFragment<FragmentWhatsAppTasksTwoBinding>(R.layout.fragment_whats_app_tasks_two) {

    override val binding: FragmentWhatsAppTasksTwoBinding by viewBinding(
        FragmentWhatsAppTasksTwoBinding::bind
    )

    lateinit var taskListAdapter: TaskListWOImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = TaskListWOImageAdapter()
        binding.rvWhatsAppTaskListTwo.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}