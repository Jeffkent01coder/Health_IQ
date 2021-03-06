package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypoglycemiaBinding
import com.example.healthiq.recipe.CovidRecipe
import com.example.healthiq.recipe.HypoRecipe

class Hypoglycemia : AppCompatActivity() {
    private lateinit var binding: ActivityHypoglycemiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypoglycemiaBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, HypoRecipe::class.java))
        }
    }
}