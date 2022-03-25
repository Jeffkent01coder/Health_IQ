package com.example.healthiq.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypoRecipeBinding
import com.example.healthiq.ui.Arthritis
import com.example.healthiq.ui.Hypoglycemia

class HypoRecipe : AppCompatActivity() {
    private lateinit var binding: ActivityHypoRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypoRecipeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Hypoglycemia::class.java))
        }
    }
}