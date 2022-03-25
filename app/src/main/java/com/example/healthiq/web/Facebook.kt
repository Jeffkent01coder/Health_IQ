package com.example.healthiq.web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.healthiq.databinding.ActivityFacebookBinding

class Facebook : AppCompatActivity() {
    private lateinit var binding: ActivityFacebookBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFacebookBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.FaceWeb.settings.javaScriptEnabled = true
        binding.FaceWeb.settings.loadWithOverviewMode = true
        binding.FaceWeb.settings.useWideViewPort = true
        binding.FaceWeb.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.FaceWeb.loadUrl("https://www.facebook.com/WHO")

    }
}