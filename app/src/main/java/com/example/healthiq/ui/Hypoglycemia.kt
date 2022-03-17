package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypoglycemiaBinding

class Hypoglycemia : AppCompatActivity() {
    private lateinit var binding: ActivityHypoglycemiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypoglycemiaBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}