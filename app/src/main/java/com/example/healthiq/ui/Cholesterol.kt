package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCholesterolBinding

class Cholesterol : AppCompatActivity() {
    private lateinit var binding: ActivityCholesterolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCholesterolBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}