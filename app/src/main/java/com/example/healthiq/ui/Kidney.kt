package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityKidneyBinding
import com.example.healthiq.recipe.CovidRecipe
import com.example.healthiq.recipe.KidneyRecipe

class Kidney : AppCompatActivity() {
    private lateinit var binding: ActivityKidneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKidneyBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, KidneyRecipe::class.java))
        }
    }
}