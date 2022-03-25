package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityKidneyRecipeBinding

class KidneyRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityKidneyRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKidneyRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}