package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityGoutBinding
import com.example.healthiq.recipe.CovidRecipe
import com.example.healthiq.recipe.GoutRecipe

class Gout : AppCompatActivity() {
    private lateinit var binding: ActivityGoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGoutBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, GoutRecipe::class.java))
        }
    }
}