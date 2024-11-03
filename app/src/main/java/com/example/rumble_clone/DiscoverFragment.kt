package com.example.rumble_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DiscoverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_discover, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.trending_recycler)
        val trendingItems = listOf(
            DiscoverItem("Trending 1", R.drawable.thumbnail1),
            DiscoverItem("Trending 2", R.drawable.thumbnail2),
            DiscoverItem("Trending 3", R.drawable.thumbnail3),
            DiscoverItem("Trending 4", R.drawable.thumbnail4)
        )

        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.adapter = DiscoverAdapter(trendingItems)

        return view
    }
}
