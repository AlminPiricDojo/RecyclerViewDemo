package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.databinding.ItemCustomRowBinding

class MessageAdapter(private val messages: ArrayList<String>):
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {
    class MessageViewHolder(val binding: ItemCustomRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            ItemCustomRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.binding.apply {
            tvMessage.text = message
        }
    }

    override fun getItemCount() = messages.size
}