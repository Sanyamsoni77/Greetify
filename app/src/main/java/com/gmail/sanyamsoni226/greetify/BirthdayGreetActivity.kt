package com.gmail.sanyamsoni226.greetify

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gmail.sanyamsoni226.greetify.databinding.ActivityBirthdayGreetBinding


class BirthdayGreetActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBirthdayGreetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(NAME_EXTRA)
        binding.birthdayMsg.text = "Happy Birthday\n $name ! 🎂"
    }
}
