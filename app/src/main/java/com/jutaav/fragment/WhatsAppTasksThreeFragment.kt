package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.TaskListWithImageAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentWhatsAppTasksThreeBinding
import com.wada811.viewbinding.viewBinding

class WhatsAppTasksThreeFragment :
    BaseFragment<FragmentWhatsAppTasksThreeBinding>(R.layout.fragment_whats_app_tasks_three) {

    override val binding: FragmentWhatsAppTasksThreeBinding by viewBinding(
        FragmentWhatsAppTasksThreeBinding::bind
    )

    lateinit var taskListAdapter: TaskListWithImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = TaskListWithImageAdapter()
        binding.rvWhatsAppTaskListThree.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}