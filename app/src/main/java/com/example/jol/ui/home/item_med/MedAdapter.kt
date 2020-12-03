package com.example.jol.ui.home.item_med

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jol.R
import com.example.jol.ui.home.item_jol.JolViewHolder
import com.example.jol.ui.home.item_test.Item

class MedAdapter: RecyclerView.Adapter<MedViewHolder>() {

    var models: MutableList<Item> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedViewHolder {
        var item = LayoutInflater.from(parent.context).inflate(R.layout.shtraf_item, parent, false)
        return MedViewHolder(item)
    }

    override fun onBindViewHolder(holder: MedViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount(): Int {
        return models.size
    }
}