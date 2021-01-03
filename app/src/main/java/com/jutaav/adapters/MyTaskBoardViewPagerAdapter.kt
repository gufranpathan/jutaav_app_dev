package com.jutaav.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.jutaav.fragment.ActiveTasksFragment

class MyTaskBoardViewPagerAdapter(
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        return ActiveTasksFragment()
    }

    override fun getItemCount(): Int = 2
}