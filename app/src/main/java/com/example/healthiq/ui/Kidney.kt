package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityKidneyBinding

class Kidney : AppCompatActivity() {
    private lateinit var binding: ActivityKidneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKidneyBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}