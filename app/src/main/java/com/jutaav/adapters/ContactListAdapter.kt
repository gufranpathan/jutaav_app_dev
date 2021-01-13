package com.jutaav.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jutaav.databinding.ItemLayoutContactListBinding

class ContactListAdapter : RecyclerView.Adapter<ContactListAdapter.ResultViewHolder>() {

    inner class ResultViewHolder(val binding: ItemLayoutContactListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val binding = ItemLayoutContactListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ResultViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}