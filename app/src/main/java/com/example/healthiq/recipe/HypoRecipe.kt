package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypoRecipeBinding

class HypoRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityHypoRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypoRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}