package com.example.rumble_clone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin)
        findViewById<Button>(R.id.create_account_button).setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)  // Navigate to CreateAccountActivity
        }

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