package com.example.rumble_clone
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recommendations_recycler)
        val channels = listOf(
            Channel("Jerry After Dark", R.drawable.channel_image1),
            Channel("Wake Up Mintzy", R.drawable.channel_image2),
            Channel("The Wontons", R.drawable.channel_image3),
            Channel("UFC", R.drawable.channel_image4)
        )
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = ChannelAdapter(channels)

        // Setup BottomNavigationView
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
