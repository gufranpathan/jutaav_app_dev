package com.jutaav.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.jutaav.R
import com.jutaav.databinding.ItemLayoutAddVolunteerPhonebookBinding

class AddVolunteerFromPhonebookAdapter(val context: Context) :
    RecyclerView.Adapter<AddVolunteerFromPhonebookAdapter.AddVolunteerViewHolder>() {

    inner class AddVolunteerViewHolder(val binding: ItemLayoutAddVolunteerPhonebookBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddVolunteerViewHolder {
        val binding = ItemLayoutAddVolunteerPhonebookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AddVolunteerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: AddVolunteerViewHolder, position: Int) {

        holder.binding.root.setOnClickListener {
            if (holder.binding.cbAddContact.isChecked) {
                holder.binding.cbAddContact.isChecked = false
                holder.binding.cnstMainLayout.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.color_FFFFFF
                    )
                )
            } else {
                holder.binding.cbAddContact.isChecked = true
                holder.binding.cnstMainLayout.setBackgroundColor(
                    ContextCompat.getColor(
                        context,
                        R.color.color_C4C4C4
                    )
                )
            }
        }
    }
}