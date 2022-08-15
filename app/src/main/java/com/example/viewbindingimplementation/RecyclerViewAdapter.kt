package com.example.viewbindingimplementation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindingimplementation.databinding.ItemLayoutBinding

class RecyclerViewAdapter(val list : List<String>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder>() {

    inner class RecyclerViewViewHolder(val binding: ItemLayoutBinding):  RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecyclerViewViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        holder.binding.textView.text = list[position]
    }

}