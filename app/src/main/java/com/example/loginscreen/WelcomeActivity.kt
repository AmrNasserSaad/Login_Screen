package com.example.loginscreen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.loginscreen.databinding.ActivityMainBinding
import com.example.loginscreen.databinding.ActivityWelcomeBinding


class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userInput = intent.getStringExtra("userInput")
        binding.WelcomeTextView.text ="  Welcome\n$userInput"


       Toast.makeText(this,"Hi",Toast.LENGTH_LONG).show()




    }
}