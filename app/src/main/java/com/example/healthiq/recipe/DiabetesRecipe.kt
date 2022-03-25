package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityDiabetesRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Diabetes

class DiabetesRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityDiabetesRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDiabetesRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Diabetes::class.java))
        }
    }
}