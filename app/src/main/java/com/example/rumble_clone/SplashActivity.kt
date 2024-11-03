package com.example.rumble_clone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Use coroutine to delay and transition to MainActivity
        lifecycleScope.launch {
            delay(3000) // 3-second delay
            startActivity(Intent(this@SplashActivity, WelcomeActivity::class.java))
            finish()
        }
    }
}
