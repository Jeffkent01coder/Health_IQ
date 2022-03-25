package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityArthRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Home

class ArthRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityArthRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityArthRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Arthritis::class.java))
        }
    }
}