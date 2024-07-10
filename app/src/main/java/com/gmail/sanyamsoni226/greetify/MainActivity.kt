package com.gmail.sanyamsoni226.greetify

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gmail.sanyamsoni226.greetify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener on button
        binding.cardButton.setOnClickListener {
            val name = binding.userName.text.toString()
            val intent = Intent(this, BirthdayGreetActivity::class.java)
            intent.putExtra(BirthdayGreetActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}
