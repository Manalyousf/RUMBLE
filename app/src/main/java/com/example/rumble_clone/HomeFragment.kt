package com.example.rumble_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Set up RecyclerView for recommendations
        val recyclerView = view.findViewById<RecyclerView>(R.id.recommendations_recycler)
        val channels = listOf(
            Channel("Jerry After Dark", R.drawable.channel_image1),
            Channel("Wake Up Mintzy", R.drawable.channel_image2),
            Channel("The Wontons", R.drawable.channel_image3),
            Channel("UFC", R.drawable.channel_image4)
        )
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = ChannelAdapter(channels)

        return view
    }
}
