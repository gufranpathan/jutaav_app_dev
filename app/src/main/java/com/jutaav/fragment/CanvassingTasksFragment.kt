package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.TaskListWithImageAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentCanvassingTasksBinding
import com.wada811.viewbinding.viewBinding

class CanvassingTasksFragment :
    BaseFragment<FragmentCanvassingTasksBinding>(R.layout.fragment_canvassing_tasks) {

    override val binding: FragmentCanvassingTasksBinding by viewBinding(
        FragmentCanvassingTasksBinding::bind
    )

    lateinit var tasksListAdapter: TaskListWithImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tasksListAdapter = TaskListWithImageAdapter()
        binding.rvCanvassingTasks.apply {
            adapter = tasksListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}