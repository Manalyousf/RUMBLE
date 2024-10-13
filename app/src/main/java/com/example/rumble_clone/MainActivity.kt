package com.example.rumble_clone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handle button clicks
        findViewById<Button>(R.id.email_button).setOnClickListener {
            Toast.makeText(this, "Continue with email", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.google_button).setOnClickListener {
            Toast.makeText(this, "Continue with Google", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.facebook_button).setOnClickListener {
            Toast.makeText(this, "Continue with Facebook", Toast.LENGTH_SHORT).show()
        }

        // Handle window insets for edge-to-edge experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
