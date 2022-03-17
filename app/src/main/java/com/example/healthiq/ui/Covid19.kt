package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCovid19Binding

class Covid19 : AppCompatActivity() {
    private lateinit var binding:ActivityCovid19Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCovid19Binding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}