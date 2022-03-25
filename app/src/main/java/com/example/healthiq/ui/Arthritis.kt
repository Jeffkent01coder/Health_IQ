package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityArthritisBinding
import com.example.healthiq.recipe.ArthRecipe

class Arthritis : AppCompatActivity() {
    private lateinit var binding: ActivityArthritisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityArthritisBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, ArthRecipe::class.java))
        }
    }
}