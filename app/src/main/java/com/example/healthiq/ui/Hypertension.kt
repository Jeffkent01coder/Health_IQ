package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHypertensionBinding

class Hypertension : AppCompatActivity() {
    private lateinit var binding: ActivityHypertensionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHypertensionBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

//        binding.btnRecipeHyp.setOnClickListener {
//            startActivity(Intent(this, ))
//        }
    }
}