package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Hypertension

class HypRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityHypRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Hypertension::class.java))
        }
    }
}