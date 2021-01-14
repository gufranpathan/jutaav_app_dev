package com.jutaav.activity

import com.jutaav.R
import com.jutaav.base.extensions.tag
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityShareToWhatsAppBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber

class ShareToWhatsAppActivity :
    BaseActivity<ActivityShareToWhatsAppBinding>(R.layout.activity_share_to_whats_app) {

    override val binding: ActivityShareToWhatsAppBinding by viewBinding(
        ActivityShareToWhatsAppBinding::bind
    )

    override fun oViewInitialized() {

    }
}