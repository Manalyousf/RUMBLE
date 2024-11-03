package com.example.rumble_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_account, container, false)

        // Initialize UI elements and handle clicks
        view.findViewById<TextView>(R.id.premium_plan).setOnClickListener {
            // Handle premium plan click
            Toast.makeText(requireContext(), "Get Rumble Premium Plan clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Premium Plan or open a related screen
        }

        view.findViewById<TextView>(R.id.your_videos).setOnClickListener {
            // Handle your videos click
            Toast.makeText(requireContext(), "Your Videos clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Your Videos screen
        }

        view.findViewById<TextView>(R.id.following).setOnClickListener {
            // Handle following click
            Toast.makeText(requireContext(), "Following clicked", Toast.LENGTH_SHORT).show()
            // Navigate to Following screen
        }

        view.findViewById<TextView>(R.id.sign_out).setOnClickListener {
            // Handle sign out click
            Toast.makeText(requireContext(), "Sign Out clicked", Toast.LENGTH_SHORT).show()
            // Handle the sign-out logic, such as clearing user session
        }

        // Bottom Navigation logic
        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    Toast.makeText(requireContext(), "Home clicked", Toast.LENGTH_SHORT).show()
                    // Navigate to Home Fragment or Activity
                    true
                }
                R.id.discover -> {
                    Toast.makeText(requireContext(), "Discover clicked", Toast.LENGTH_SHORT).show()
                    // Navigate to Discover Fragment or Activity
                    true
                }
                R.id.create -> {
                    Toast.makeText(requireContext(), "Create clicked", Toast.LENGTH_SHORT).show()
                    // Navigate to Create screen
                    true
                }
                R.id.library -> {
                    Toast.makeText(requireContext(), "Library clicked", Toast.LENGTH_SHORT).show()
                    // Navigate to Library Fragment or Activity
                    true
                }
                R.id.account -> {
                    // Stay on the current Account Fragment
                    Toast.makeText(requireContext(), "Already on Account", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        return view
    }
}
