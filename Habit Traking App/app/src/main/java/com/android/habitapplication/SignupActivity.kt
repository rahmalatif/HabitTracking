package com.android.habitapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.habitapplication.ui.onboarding.Onboarding1Activity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val backBtn = findViewById<ImageButton>(R.id.btnBack)
        val loginBtn = findViewById<Button>(R.id.btnLogin)
        val alreadyUser: TextView = findViewById(R.id.tvSignIn)

        loginBtn.setOnClickListener {
            startActivity(Intent(this, Onboarding1Activity::class.java))
            finish()
        }
        alreadyUser.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        backBtn.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }
    }
}