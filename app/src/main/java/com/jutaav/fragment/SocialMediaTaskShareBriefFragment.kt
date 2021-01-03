package com.jutaav.fragment

import android.os.Bundle
import android.view.View
import com.jutaav.R
import com.jutaav.baseandroid.BaseFragment
import com.jutaav.databinding.FragmentSocialMediaTaskShareBriefBinding
import com.wada811.viewbinding.viewBinding

class SocialMediaTaskShareBriefFragment : BaseFragment<FragmentSocialMediaTaskShareBriefBinding>
    (R.layout.fragment_social_media_task_share_brief) {

    override val binding: FragmentSocialMediaTaskShareBriefBinding
            by viewBinding(FragmentSocialMediaTaskShareBriefBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}