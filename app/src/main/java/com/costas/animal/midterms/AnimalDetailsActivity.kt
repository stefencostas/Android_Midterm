package com.costas.animal.midterms

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.costas.animal.midterms.databinding.ActivityAnimalDetailsBinding

class AnimalDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAnimalDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val details = intent.getStringExtra("details")

        binding.nameTextView.text = name
        binding.detailsTextView.text = details
    }

    fun blockAnimal() {
        val intent = Intent(this, AnimalNamesActivity::class.java)
        startActivity(intent)
    }
}