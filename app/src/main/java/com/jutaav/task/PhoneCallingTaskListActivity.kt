package com.jutaav.task

import androidx.recyclerview.widget.LinearLayoutManager
import com.jutaav.R
import com.jutaav.adapters.PhoneCallingTaskListAdapter
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityPhoneCallingTaskListBinding
import com.wada811.viewbinding.viewBinding

class PhoneCallingTaskListActivity :
    BaseActivity<ActivityPhoneCallingTaskListBinding>(R.layout.activity_phone_calling_task_list) {

    override val binding: ActivityPhoneCallingTaskListBinding by viewBinding(
        ActivityPhoneCallingTaskListBinding::bind
    )

    lateinit var taskListAdapter: PhoneCallingTaskListAdapter

    override fun oViewInitialized() {
        taskListAdapter = PhoneCallingTaskListAdapter()
        binding.rvPhoneCallingTasks.apply {
            adapter = taskListAdapter
            layoutManager = LinearLayoutManager(this@PhoneCallingTaskListActivity)
        }
    }
}