package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypRecipeBinding

class HypRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityHypRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}