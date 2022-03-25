package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityCholRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Cholesterol

class CholRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityCholRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCholRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Cholesterol::class.java))
        }
    }
}