package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCovidRecipeBinding

class CovidRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCovidRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCovidRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}