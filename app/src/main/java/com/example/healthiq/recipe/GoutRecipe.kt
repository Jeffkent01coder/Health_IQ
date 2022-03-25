package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityGoutRecipeBinding

class GoutRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityGoutRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGoutRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}