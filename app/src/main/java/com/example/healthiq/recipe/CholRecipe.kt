package com.example.healthiq.recipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCholRecipeBinding

class CholRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCholRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCholRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}