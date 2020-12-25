package com.jutaav.activity

import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityLinkPhonebookBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class LinkPhonebookActivity :
    BaseActivity<ActivityLinkPhonebookBinding>(R.layout.activity_link_phonebook) {

    override val binding: ActivityLinkPhonebookBinding by viewBinding(ActivityLinkPhonebookBinding::bind)

    override fun oViewInitialized() {

    }
}