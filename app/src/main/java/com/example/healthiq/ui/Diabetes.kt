package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityDiabetesBinding
import com.example.healthiq.recipe.CovidRecipe
import com.example.healthiq.recipe.DiabetesRecipe

class Diabetes : AppCompatActivity() {
    private lateinit var binding: ActivityDiabetesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDiabetesBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, DiabetesRecipe::class.java))
        }
    }
}