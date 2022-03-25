package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityDiabetesRecipeBinding

class DiabetesRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityDiabetesRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDiabetesRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}