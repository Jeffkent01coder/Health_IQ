package com.example.healthiq.web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.healthiq.databinding.ActivityFacebookBinding
import com.example.healthiq.databinding.ActivityInstagramBinding

class Instagram : AppCompatActivity() {
    private lateinit var binding: ActivityInstagramBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInstagramBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.IgWeb.settings.javaScriptEnabled = true
        binding.IgWeb.settings.loadWithOverviewMode = true
        binding.IgWeb.settings.useWideViewPort = true
        binding.IgWeb.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.IgWeb.loadUrl("https://www.instagram.com/who/")
    }
}