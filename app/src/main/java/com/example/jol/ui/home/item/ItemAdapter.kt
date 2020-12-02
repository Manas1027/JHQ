package com.example.jol.ui.home.item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R

class ItemAdapter: RecyclerView.Adapter<ItemViewHolder>() {

    var items: MutableList<Item> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.shtraf_item, parent, false)
        return ItemViewHolder(item)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.populateModel(items[position])
    }
}