package com.example.rumble_clone
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.rumble_clone.R

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        // Set up form handling, for example:
        findViewById<Button>(R.id.submit_button).setOnClickListener {
            val username = findViewById<EditText>(R.id.username_field).text.toString()
            val email = findViewById<EditText>(R.id.email_field).text.toString()
            val birthday = findViewById<EditText>(R.id.birthday_field).text.toString()
            val gender = findViewById<Spinner>(R.id.gender_spinner).selectedItem.toString()

            // Handle the form submission logic
            Toast.makeText(this, "Account Created: $username", Toast.LENGTH_SHORT).show()
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
