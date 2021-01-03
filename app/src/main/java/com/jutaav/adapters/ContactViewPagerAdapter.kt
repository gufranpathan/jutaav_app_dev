package com.jutaav.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jutaav.fragment.SearchContactFragment

class ContactViewPagerAdapter(
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        return SearchContactFragment()
    }

    override fun getItemCount(): Int = 2
}