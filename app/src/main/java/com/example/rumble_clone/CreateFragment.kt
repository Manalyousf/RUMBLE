package com.example.rumble_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast

class CreateFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_create, container, false)

        // Buttons for content creation options
        view.findViewById<Button>(R.id.record_button).setOnClickListener {
            Toast.makeText(requireContext(), "Start Recording", Toast.LENGTH_SHORT).show()
        }

        view.findViewById<Button>(R.id.upload_button).setOnClickListener {
            Toast.makeText(requireContext(), "Upload Media", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
