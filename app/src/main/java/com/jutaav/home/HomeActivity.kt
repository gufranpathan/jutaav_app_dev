package com.jutaav.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityHomeBinding
import com.jutaav.fragment.AddNewContactFragment
import com.wada811.viewbinding.viewBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    override val binding: ActivityHomeBinding by viewBinding(ActivityHomeBinding::bind)

    override fun oViewInitialized() {
        val fragment = AddNewContactFragment()
        addFragment(fragment, R.id.frmMain)
    }

    fun addFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction { add(frameId, fragment) }
    }

    fun replaceFragment(fragment: Fragment, frameId: Int) {
        supportFragmentManager.inTransaction { replace(frameId, fragment) }
    }

    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }
}