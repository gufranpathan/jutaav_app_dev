package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import com.google.android.material.tabs.TabLayoutMediator
import com.jutaav.R
import com.jutaav.adapters.ContactViewPagerAdapter
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentContactBinding
import com.wada811.viewbinding.viewBinding

class ContactFragment :
    BaseFragment<FragmentContactBinding>(R.layout.fragment_contact) {

    override val binding: FragmentContactBinding by viewBinding(FragmentContactBinding::bind)

    private lateinit var viewPagerAdapter: ContactViewPagerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPagerAdapter = ContactViewPagerAdapter(this)
        binding.vpTabs.adapter = viewPagerAdapter

        TabLayoutMediator(binding.tabContact, binding.vpTabs) { tab, position ->
            val tabTitle = if (position == 0) {
                "Search"
            } else {
                "Contacts"
            }
            tab.text = tabTitle
        }.attach()
    }
}