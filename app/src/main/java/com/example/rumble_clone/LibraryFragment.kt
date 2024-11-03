package com.example.rumble_clone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LibraryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_library, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.library_recycler)
        val libraryItems = listOf(
            LibraryItem("Watch Later", R.drawable.library_thumbnail1),
            LibraryItem("Liked Videos", R.drawable.library_thumbnail2),
            LibraryItem("Your Uploads", R.drawable.library_thumbnail3)
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = LibraryAdapter(libraryItems)

        return view
    }
}
