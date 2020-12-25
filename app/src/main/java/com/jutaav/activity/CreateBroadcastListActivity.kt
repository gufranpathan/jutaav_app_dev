package com.jutaav.activity

import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityCreateBroadcastListBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class CreateBroadcastListActivity :
    BaseActivity<ActivityCreateBroadcastListBinding>(R.layout.activity_create_broadcast_list) {

    override val binding: ActivityCreateBroadcastListBinding by viewBinding(
        ActivityCreateBroadcastListBinding::bind
    )

    override fun oViewInitialized() {

    }
}