package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCholesterolBinding
import com.example.healthiq.recipe.CholRecipe

class Cholesterol : AppCompatActivity() {
    private lateinit var binding: ActivityCholesterolBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCholesterolBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRecipeHyp.setOnClickListener {
            startActivity(Intent(this, CholRecipe::class.java))
        }
    }
}