package com.jutaav.fragment

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import com.google.android.material.chip.Chip
import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentSearchContactBinding
import com.wada811.viewbinding.viewBinding


class SearchContactFragment :
    BaseFragment<FragmentSearchContactBinding>(R.layout.fragment_search_contact) {

    override val binding: FragmentSearchContactBinding by viewBinding(
        FragmentSearchContactBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivFilter.setOnClickListener {
            if (binding.chipGroup.visibility == View.VISIBLE) {
                binding.chipGroup.visibility = View.GONE
            } else {
                binding.chipGroup.visibility = View.VISIBLE
            }
        }

        generateDynamicChips()
    }

    private fun generateDynamicChips() {

        val chipList = arrayListOf(
            "Name",
            "Name (Local)",
            "Father’s Name",
            "Locality",
            "Father’s Name(Local)",
            "Age"
        )

        for (singleChip in chipList) {

            val mChip = this.layoutInflater.inflate(R.layout.item_layout_chip, null, false) as Chip

            mChip.text = singleChip

            val paddingDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 10f,
                resources.displayMetrics
            ).toInt()

            mChip.setPadding(paddingDp, 0, paddingDp, 0)
            mChip.setOnCheckedChangeListener { compoundButton, b -> }

            binding.chipGroup.addView(mChip)
        }
    }
}