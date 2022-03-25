package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHelpBinding
import com.example.healthiq.web.*

class Help : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHelpBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        binding.FaceWeb.setOnClickListener {
            startActivity(Intent(this, Facebook::class.java))
        }

        binding.IgWeb.setOnClickListener {
            startActivity(Intent(this, Instagram::class.java))
        }

        binding.LInkedWeb.setOnClickListener {
            startActivity(Intent(this, LinkedIn::class.java))
        }

        binding.TwitWeb.setOnClickListener {
            startActivity(Intent(this, Twitter::class.java))
        }

        binding.mail.setOnClickListener {
            startActivity(Intent(this, Mail::class.java))
        }
    }
}