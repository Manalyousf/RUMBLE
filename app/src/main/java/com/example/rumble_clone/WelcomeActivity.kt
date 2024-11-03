package com.example.rumble_clone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.Toast
import com.example.rumble_clone.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Button click to navigate to SignInActivity
        findViewById<Button>(R.id.email_button).setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)  // Navigate to SignInActivity
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
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set default selected item to home
        bottomNavigationView.selectedItemId = R.id.home

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.discover -> {
                    // Start Discover Activity
                    startActivity(Intent(this, DiscoverActivity::class.java))
                    true
                }
                R.id.create -> {
                    // Start Create Activity
                    startActivity(Intent(this, CreateActivity::class.java))
                    true
                }
                R.id.library -> {
                    // Start Library Activity
                    startActivity(Intent(this, LibraryActivity::class.java))
                    true
                }
                R.id.account -> {
                    // Start Account Activity
                    startActivity(Intent(this, AccountActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
