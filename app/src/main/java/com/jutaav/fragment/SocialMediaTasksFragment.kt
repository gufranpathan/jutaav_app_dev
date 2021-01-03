package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.TaskListWithImageAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentSocialMediaTasksBinding
import com.wada811.viewbinding.viewBinding

class SocialMediaTasksFragment :
    BaseFragment<FragmentSocialMediaTasksBinding>(R.layout.fragment_social_media_tasks) {

    override val binding: FragmentSocialMediaTasksBinding by viewBinding(
        FragmentSocialMediaTasksBinding::bind
    )

    lateinit var taskListAdapter: TaskListWithImageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        taskListAdapter = TaskListWithImageAdapter()
        binding.rvSocialMediaTasks.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        super.onViewCreated(view, savedInstanceState)
    }
}