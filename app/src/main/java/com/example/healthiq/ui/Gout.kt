package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityGoutBinding

class Gout : AppCompatActivity() {
    private lateinit var binding: ActivityGoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGoutBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}