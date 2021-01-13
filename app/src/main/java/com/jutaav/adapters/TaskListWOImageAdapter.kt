package com.jutaav.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jutaav.databinding.ItemLayoutTaskListWoImageBinding

class TaskListWOImageAdapter :
    RecyclerView.Adapter<TaskListWOImageAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(val binding: ItemLayoutTaskListWoImageBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val binding = ItemLayoutTaskListWoImageBinding.inflate(
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