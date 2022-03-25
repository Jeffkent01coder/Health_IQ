package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCovidRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Covid19

class CovidRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCovidRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCovidRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Covid19::class.java))
        }
    }
}