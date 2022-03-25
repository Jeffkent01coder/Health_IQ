package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityArthRecipeBinding

class ArthRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityArthRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityArthRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}