package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.widget.addTextChangedListener
import com.example.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , TextWatcher{
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        TextChangedWatching()


        binding.LoginButton.setOnClickListener {

            visibility()

            val intent = Intent(this, WelcomeActivity::class.java)
            val userInput = binding.userNameEditText.text.toString()
            intent.putExtra("userInput", userInput)
            startActivity(intent)
        }



    }



    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        val email = binding.emailEditText.text.toString()
        val password = binding.emailEditText.text.toString()

        binding.LoginButton.isEnabled =  email.trim().isNotEmpty() && password.trim().isNotEmpty()

    }

    fun visibility() {
        binding.ProgressBar.visibility = View.VISIBLE
        binding.emailEditText.visibility = View.GONE
        binding.passwordEditText.visibility = View.GONE
        binding.userNameEditText.visibility = View.GONE
        binding.LoginButton.visibility = View.GONE
        binding.icon.visibility = View.GONE


    }

    fun TextChangedWatching(){
        binding.emailEditText.addTextChangedListener(this) // Watching the change of input Field
        binding.passwordEditText.addTextChangedListener(this) // Watching the change of input Field
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }
    override fun afterTextChanged(p0: Editable?) {
    }

}