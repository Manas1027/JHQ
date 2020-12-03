package com.example.jol.ui.home.item_transport

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R
import com.example.jol.ui.home.item_jol.JolViewHolder
import com.example.jol.ui.home.item_test.Item

class TransportAdapter: RecyclerView.Adapter<TransportViewHolder>() {

    var models: MutableList<Item> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return TransportViewHolder(item)
    }

    override fun onBindViewHolder(holder: TransportViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}