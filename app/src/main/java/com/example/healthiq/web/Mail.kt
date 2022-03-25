package com.example.healthiq.web

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.healthiq.databinding.ActivityMailBinding

class Mail : AppCompatActivity() {
    private lateinit var binding: ActivityMailBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        binding = ActivityMailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.mail.settings.javaScriptEnabled = true
        binding.mail.settings.loadWithOverviewMode = true
        binding.mail.settings.useWideViewPort = true
        binding.mail.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        binding.mail.loadUrl("https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=ps@health.go.ke")
    }
}
