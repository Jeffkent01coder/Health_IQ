package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityKidneyRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Kidney

class KidneyRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityKidneyRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKidneyRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Kidney::class.java))
        }
    }
}