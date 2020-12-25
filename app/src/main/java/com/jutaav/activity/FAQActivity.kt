package com.jutaav.activity

import android.annotation.TargetApi
import android.app.Activity
import android.os.Build
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.jutaav.R
import com.jutaav.baseandroid.BaseActivity
import com.jutaav.databinding.ActivityFaqBinding
import com.wada811.viewbinding.viewBinding

class FAQActivity : BaseActivity<ActivityFaqBinding>(R.layout.activity_faq) {

    override val binding: ActivityFaqBinding by viewBinding(ActivityFaqBinding::bind)

    override fun oViewInitialized() {

        binding.webView.getSettings().setJavaScriptEnabled(true) // enable javascript

        val activity: Activity = this

        binding.webView.setWebViewClient(object : WebViewClient() {
            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show()
            }

            @TargetApi(Build.VERSION_CODES.M)
            override fun onReceivedError(
                view: WebView?,
                req: WebResourceRequest,
                rerr: WebResourceError
            ) {
                // Redirect to deprecated method, so you can use it in all SDK versions
                onReceivedError(
                    view,
                    rerr.errorCode,
                    rerr.description.toString(),
                    req.url.toString()
                )
            }
        })

        binding.webView.loadUrl("https://www.google.com")
    }
}