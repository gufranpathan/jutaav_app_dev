package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayoutMediator
import com.jutaav.R
import com.jutaav.adapters.MyTaskBoardViewPagerAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentMyTasksBoardBinding
import com.wada811.viewbinding.viewBinding

class MyTasksBoardFragment :
    BaseFragment<FragmentMyTasksBoardBinding>(R.layout.fragment_my_tasks_board) {

    override val binding: FragmentMyTasksBoardBinding by viewBinding(FragmentMyTasksBoardBinding::bind)

    private lateinit var viewPagerAdapter: MyTaskBoardViewPagerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPagerAdapter = MyTaskBoardViewPagerAdapter(this)
        binding.vpTabs.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabStatus, binding.vpTabs) { tab, position ->
            val tabTitle = if (position == 0) {
                "Active"
            } else {
                "Completed"
            }
            tab.text = tabTitle
        }.attach()
    }
}