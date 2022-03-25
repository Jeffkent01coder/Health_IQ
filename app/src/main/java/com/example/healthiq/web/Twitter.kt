package com.example.healthiq.web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.healthiq.databinding.ActivityFacebookBinding
import com.example.healthiq.databinding.ActivityTwitterBinding

class Twitter : AppCompatActivity() {
    private lateinit var binding: ActivityTwitterBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTwitterBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.TwitWeb.settings.javaScriptEnabled = true
        binding.TwitWeb.settings.loadWithOverviewMode = true
        binding.TwitWeb.settings.useWideViewPort = true
        binding.TwitWeb.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.TwitWeb.loadUrl("https://twitter.com/intent/follow?source=followbutton&variant=1.0&screen_name=who")
    }
}