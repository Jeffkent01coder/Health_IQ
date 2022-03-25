package com.example.healthiq.web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.healthiq.databinding.ActivityFacebookBinding
import com.example.healthiq.databinding.ActivityLinkedInBinding

class LinkedIn : AppCompatActivity() {
    private lateinit var binding: ActivityLinkedInBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLinkedInBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.LInkedWeb.settings.javaScriptEnabled = true
        binding.LInkedWeb.settings.loadWithOverviewMode = true
        binding.LInkedWeb.settings.useWideViewPort = true
        binding.LInkedWeb.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.LInkedWeb.loadUrl("https://www.linkedin.com/company/world-health-organization/")
    }
}