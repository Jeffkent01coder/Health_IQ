package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityGoutRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Gout

class GoutRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityGoutRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGoutRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Gout::class.java))
        }
    }
}