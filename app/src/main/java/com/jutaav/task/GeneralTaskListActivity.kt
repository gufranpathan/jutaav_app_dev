package com.jutaav.task

import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.GeneralTaskListAdapter
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityGeneralTaskListBinding
import com.wada811.viewbinding.viewBinding

class GeneralTaskListActivity :
    BaseActivity<ActivityGeneralTaskListBinding>(R.layout.activity_general_task_list) {

    override val binding: ActivityGeneralTaskListBinding by viewBinding(
        ActivityGeneralTaskListBinding::bind
    )

    lateinit var taskListAdapter: GeneralTaskListAdapter

    override fun oViewInitialized() {
        taskListAdapter = GeneralTaskListAdapter()
        binding.rvGeneralTasks.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(this@GeneralTaskListActivity)
        }
    }
}