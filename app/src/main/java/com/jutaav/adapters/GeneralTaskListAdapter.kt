package com.jutaav.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jutaav.databinding.ItemLayoutGeneralTaskBinding
import com.jutaav.databinding.ItemLayoutPhoneCallingTaskBinding

class GeneralTaskListAdapter :
    RecyclerView.Adapter<GeneralTaskListAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(val binding: ItemLayoutGeneralTaskBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = ItemLayoutGeneralTaskBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TaskViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}