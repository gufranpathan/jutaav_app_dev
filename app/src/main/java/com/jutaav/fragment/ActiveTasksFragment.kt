package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.ActiveTaskListAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentActiveTasksBinding
import com.wada811.viewbinding.viewBinding

class ActiveTasksFragment :
    BaseFragment<FragmentActiveTasksBinding>(R.layout.fragment_active_tasks) {

    override val binding: FragmentActiveTasksBinding by viewBinding(FragmentActiveTasksBinding::bind)

    lateinit var taskListAdapter: ActiveTaskListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = ActiveTaskListAdapter()
        binding.rvActiveTasks.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}