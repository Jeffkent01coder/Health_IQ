package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityDiabetesBinding

class Diabetes : AppCompatActivity() {
    private lateinit var binding: ActivityDiabetesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDiabetesBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}