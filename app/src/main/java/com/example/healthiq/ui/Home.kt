package com.example.healthiq.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.help.setOnClickListener {
            startActivity(Intent(this, Help::class.java))
        }

        binding.cvHYPERTENSION.setOnClickListener {
            startActivity(Intent(this, Hypertension::class.java))
        }

        binding.cvAthritis.setOnClickListener {
            startActivity(Intent(this, Arthritis::class.java))
        }

        binding.cvCovid.setOnClickListener {
            startActivity(Intent(this, Covid19::class.java))
        }

        binding.cvDIABETES.setOnClickListener {
            startActivity(Intent(this, Diabetes::class.java))
        }

        binding.cvGout.setOnClickListener {
            startActivity(Intent(this, Gout::class.java))
        }

        binding.cvHigh.setOnClickListener {
            startActivity(Intent(this, Cholesterol::class.java))
        }

        binding.cvHypo.setOnClickListener {
            startActivity(Intent(this, Hypoglycemia::class.java))
        }
        binding.cvKidney.setOnClickListener {
            startActivity(Intent(this, Kidney::class.java))
        }

    }
}