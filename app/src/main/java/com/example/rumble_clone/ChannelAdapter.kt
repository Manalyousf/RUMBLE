package com.example.rumble_clone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChannelAdapter(private val channels: List<Channel>) : RecyclerView.Adapter<ChannelAdapter.ChannelViewHolder>() {

    class ChannelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val channelImage: ImageView = itemView.findViewById(R.id.channel_image)
        val channelTitle: TextView = itemView.findViewById(R.id.channel_title)
        val followButton: Button = itemView.findViewById(R.id.follow_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChannelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_channel, parent, false)
        return ChannelViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChannelViewHolder, position: Int) {
        val channel = channels[position]
        holder.channelImage.setImageResource(channel.imageResId)
        holder.channelTitle.text = channel.title
        holder.followButton.setOnClickListener {
            // Follow button logic
        }
    }

    override fun getItemCount(): Int = channels.size
}
