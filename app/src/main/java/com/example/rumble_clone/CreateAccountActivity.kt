package com.example.rumble_clone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        // Find views
        val usernameField = findViewById<EditText>(R.id.username_field)
        val emailField = findViewById<EditText>(R.id.email_field)
        val birthdayField = findViewById<EditText>(R.id.birthday_field)
        val genderSpinner = findViewById<Spinner>(R.id.gender_spinner)
        val submitButton = findViewById<Button>(R.id.submit_button)

        // Handle the form submission
        submitButton.setOnClickListener {
            val username = usernameField.text.toString()
            val email = emailField.text.toString()
            val birthday = birthdayField.text.toString()
            val gender = genderSpinner.selectedItem.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && birthday.isNotEmpty()) {
                // Display a success message (or you can implement the logic to save the account)
                Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show()
            }
            if (genderSpinner.selectedItem.toString() == "Select Gender") {
                // Handle the case where the hint is still selected
                Toast.makeText(this, "Please select your gender", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            }
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
